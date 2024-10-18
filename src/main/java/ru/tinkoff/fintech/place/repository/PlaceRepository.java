package ru.tinkoff.fintech.place.repository;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.tinkoff.fintech.place.entity.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, UUID> {
    Optional<Place> findPlaceByTitle(String title);
    @Query("SELECT p FROM Place p LEFT JOIN FETCH p.events WHERE p.id = :placeId")
    Optional<Place> findPlaceById(@Param("placeId") UUID placeId);
}
