package ru.fintech.kotlin.locations.impl

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import ru.fintech.kotlin.datasource.EntityScanner
import ru.fintech.kotlin.datasource.repository.impl.CustomGenericRepository
import ru.fintech.kotlin.locations.LocationService
import ru.fintech.kotlin.locations.dto.LocationDto
import ru.fintech.kotlin.locations.entity.Location
import ru.fintech.kotlin.locations.mapper.LocationMapper
import kotlin.random.Random

@Service
class LocationServiceImpl : LocationService {
    private val locationRepository = CustomGenericRepository(Location::class, EntityScanner.getEntityStorage())
    private val log = LoggerFactory.getLogger(this::class.java)

    override fun getLocations(): List<LocationDto> {
        log.info("Получен запрос на получение списка локаций")
        return locationRepository.findAll()
            .stream()
            .map(LocationMapper::entityToDto)
            .toList()
    }

    override fun getLocation(id: Long): LocationDto? {
        log.info("Получен запрос на получение конкретной локации с id: $id")
        val entity = locationRepository.findById(id)

        return if (entity != null) {
            LocationMapper.entityToDto(entity)
        } else
            null
    }

    override fun createLocation(locationDto: LocationDto): LocationDto {
        log.info("Получен запрос на создание локации с телом: $locationDto")
        val location = Location(
            id = Random.nextLong(),
            name = locationDto.name,
            slug = locationDto.slug
        )

        return LocationMapper.entityToDto(locationRepository.save(location))
    }

    override fun updateLocation(id: Long, locationDto: LocationDto): LocationDto {
        log.info("Получен запрос на обновление локации с id: $id")
        val location = locationRepository.findById(id) ?: throw IllegalArgumentException("Локации с id: $id не существует")

        location.name = locationDto.name
        location.slug = locationDto.slug

        return LocationMapper.entityToDto(locationRepository.save(location))
    }

    override fun deleteLocation(id: Long) {
        log.info("Получен запрос на удаление локации с id: $id")
        locationRepository.delete(id)
    }
}