package com.example.todobackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
public class TodoController {

    private static Logger logger = LoggerFactory.getLogger(TodoController.class);

    private final TodoRepository repo;

    TodoController(TodoRepository repo) {
        this.repo = repo;
    }

    @RequestMapping("/home")
    public String home() {
        logger.info("Request /home path");
        return "Simple response string";
    }

    @GetMapping("/todos")
    List<TodoItem> all() {
        return repo.findAll();
    }


}
