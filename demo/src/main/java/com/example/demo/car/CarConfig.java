package com.example.demo.car;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class CarConfig {

    @Bean
    CommandLineRunner commandLineRunner(CarRepository repository){
        return args -> {
            Car Mercedes = new Car(
                    1L,
                    "Mercedes",
                    "Red",
                    LocalDate.of(2020,12,20),
                    2024


            );

            Car Audi = new Car(
                    "Audi",
                    "Black",
                    LocalDate.of(2021,9,20),
                    2023


            );

            repository.saveAll(
                    List.of(Mercedes,Audi)
            );
        };
    }
}
