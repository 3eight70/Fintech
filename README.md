## Описание
1. Модуль **Currency** хранит в себе 2 и 3 пункт домашки
2. Модуль **Locations** хранит оставшиеся 1,4,5

## Примеры запросов для модуля Currency на получение событий
```http://localhost:8080/events?budget=999&currency=RUB``` для реализации с CompletableFuture
```http://localhost:8080/reactor?budget=999&currency=RUB``` для реализации с Project Reactor