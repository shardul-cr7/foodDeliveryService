package io.learning.api;

import io.learning.restaurant.model.Restaurant;
import io.learning.restaurant.repository.RestaurantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantRepository restaurantRepository;

    private Logger logger = LoggerFactory.getLogger(RestaurantController.class);

    @PostMapping("/restaurant/add")
    public ResponseEntity<?> addRestaurant(@RequestBody Restaurant restaurant) {
        try {
            restaurantRepository.save(restaurant);
            logger.info("Restaurant {} added successfully" , restaurant.getName());
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            logger.error("Error while adding a restaurant , {}" , e);
            return ResponseEntity.badRequest().build();
        }
    }
}
