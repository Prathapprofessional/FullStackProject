package com.example.fullstackproject.Controller;

import com.example.fullstackproject.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public void createTask( @RequestBody Task task){
        System.out.println(task.getDescription() + "  " + task.isCompleted());
            }

}
