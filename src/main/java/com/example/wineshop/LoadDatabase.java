package com.example.wineshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(WineRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Wine(500L, "aa","1900","1900",1, "Spain", "Spain", 5.5,"Verdejo", "aa", "mucha" )));
            //log.info("Preloading " + repository.save(new Wine("Frodo Baggins", "thief")));*/

        };
    }
}
