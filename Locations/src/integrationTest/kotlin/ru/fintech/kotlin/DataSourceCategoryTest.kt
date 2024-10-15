package ru.fintech.kotlin

import com.github.tomakehurst.wiremock.client.WireMock.configureFor
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.okJson
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.wait.strategy.Wait
import org.testcontainers.utility.DockerImageName
import ru.fintech.kotlin.category.entity.Category
import ru.fintech.kotlin.config.ExecutorsProperties
import ru.fintech.kotlin.datasource.DataSource
import ru.fintech.kotlin.datasource.initializers.DataSourceCategoryInitializer
import ru.fintech.kotlin.datasource.repository.impl.CustomGenericRepository
import java.time.Duration
import java.util.concurrent.Executors

class DataSourceCategoryTest {
    private val wireMockContainer = GenericContainer(DockerImageName.parse("wiremock/wiremock:2.35.1-1"))
        .withExposedPorts(8080)
        .waitingFor(Wait.forListeningPort().withStartupTimeout(Duration.ofMinutes(2)))

    private lateinit var dataSource: DataSource
    private lateinit var initializer: DataSourceCategoryInitializer
    private lateinit var repository: CustomGenericRepository<Category>
    private val properties = ExecutorsProperties(
        duration = Duration.ofMinutes(1000)
    )
    private val fixedThreadPool = Executors.newFixedThreadPool(properties.fixedPoolSize).apply {
        Thread.currentThread().name = "LocationFixedThreadPool"
    }
    private val fixedScheduledPool = Executors.newScheduledThreadPool(properties.scheduledPoolSize).apply {
        Thread.currentThread().name = "ScheduledThreadPool"
    }

    @BeforeEach
    fun setup() {
        wireMockContainer.start()
        val wireMockPort = wireMockContainer.getMappedPort(8080)
        val wireMockHost = wireMockContainer.host
        configureFor(wireMockHost, wireMockPort)
        dataSource = DataSource()
        dataSource.createTable("categories")
        repository = CustomGenericRepository(Category::class, dataSource)
        initializer = DataSourceCategoryInitializer(
            repository = repository,
            url = "http://$wireMockHost:$wireMockPort",
            fixedThreadPool = fixedThreadPool,
            scheduledThreadPool = fixedScheduledPool,
            properties = properties
        )
    }

    @AfterEach
    fun tearDown() {
        if (wireMockContainer.isRunning) {
            wireMockContainer.stop()
        }
    }

    @Test
    @DisplayName("При получении данных от сервера должен сохранить")
    fun shouldSaveMockData() {
        stubFor(
            get("/public-api/v1.4/place-categories")
                .willReturn(
                    okJson(
                        """
                    [
                        {"id": "1", "name": "spb", "slug": "spb"},
                        {"id": "2", "name": "tsk", "slug": "tsk"}
                    ]
                    """.trimIndent()
                    )
                )
        )

        initializer.initializeData()

        val categories = repository.findAll()

        Assertions.assertEquals(categories.size, 2)

        //Конкретно в этой ситуации придется проверить так, потому что под капотом id генерятся автоматически,
        //а последовательность гарантировать нельзя
        categories.forEach { category ->
            Assertions.assertTrue(category.name == "spb" || category.name == "tsk")
        }
    }

    @Test
    @DisplayName("Должен выкидывать Runtime exception, если при попытке получения данных произошла ошибка")
    fun shouldThrowExceptionWhenConnectionFailed() {
        wireMockContainer.stop()

        val exception = assertThrows<RuntimeException> {
            initializer.initializeData()
        }

        Assertions.assertEquals(exception.message, "Что-то пошло не так")
    }

    @Test
    @DisplayName("Должен выкидывать Runtime exception, если при попытке парсинга полученного сообщения произошла ошибка")
    fun shouldThrowExceptionWhenParsingFailed() {
        stubFor(
            get("/public-api/v1.4/place-categories")
                .willReturn(
                    okJson(
                        """{"blablalb":  "dasvas"}"""
                    )
                )
        )

        val exception = assertThrows<RuntimeException> {
            initializer.initializeData()
        }

        Assertions.assertEquals(exception.message, "Что-то пошло не так")
    }
}