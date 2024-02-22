package com.example.fullstackproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {
    @GetMapping("/hello")
    public String home()
    {
        return "Hello World";
    }

    @PostMapping("/api/work")
    public List<String> createTask(){
        List<String> users = new ArrayList<>();
        users.add("Adam");
        users.add("Bob");
        users.add("Charles");
        return users;
    }

}
