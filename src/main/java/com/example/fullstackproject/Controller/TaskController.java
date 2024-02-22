package com.example.fullstackproject.Controller;

import com.example.fullstackproject.model.Task;
import com.example.fullstackproject.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;
    @GetMapping("/hello")
    public String home()
    {
        return "Hello World";
    }

    @PostMapping("/api/work")
    public Task createTask( @RequestBody Task task){
        //System.out.println(task.getDescription() + "  " + task.isCompleted());
        taskRepository.save(task);
        return task;
            }

}
