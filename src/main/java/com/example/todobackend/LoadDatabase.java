package com.example.todobackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDataBase(TodoRepository repo) {
        return args -> {
            log.info("Preloading " + repo.save(new TodoItem("First task", "Just simple description for the first task")));
            log.info("Preloading " + repo.save(new TodoItem("Second task", "Just simple description for the second task")));
        };
    }
}
