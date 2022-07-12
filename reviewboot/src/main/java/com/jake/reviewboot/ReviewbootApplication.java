package com.jake.reviewboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ReviewbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewbootApplication.class, args);
    }

    @RequestMapping(value = "/cars")
    public String displayCars() {
        return "This is our brands cars.";
    }

}
