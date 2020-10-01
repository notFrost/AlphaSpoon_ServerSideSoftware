package com.gang.alphaspoon.restaurants.domain.repository;

import com.gang.alphaspoon.restaurants.domain.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Optional<Restaurant> findByEmail(String email);
}
