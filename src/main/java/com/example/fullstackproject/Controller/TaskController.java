package com.example.fullstackproject.Controller;

import com.example.fullstackproject.model.Task;
import com.example.fullstackproject.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;
    @GetMapping("/hello")
    public String home()
    {
        return "Hello World";
    }

    @PostMapping("/api/tasks")
    public Task createTask( @RequestBody Task task){
        //System.out.println(task.getDescription() + "  " + task.isCompleted());
        taskRepository.save(task);
        return task;
            }

}
