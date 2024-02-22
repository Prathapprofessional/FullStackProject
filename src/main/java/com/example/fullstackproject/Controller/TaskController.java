package com.example.fullstackproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping("/hello")
    public String home()
    {
        return "Hello World";
    }

    @PostMapping("/api/work")
    public String post()
    {
        return "Hello post";
    }
}
