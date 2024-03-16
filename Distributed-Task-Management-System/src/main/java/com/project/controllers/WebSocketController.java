package com.project.controllers;

import com.project.entity.Task;
import com.project.services.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private TaskService taskService;

    public ResponseEntity<String>createTask(@Valid @RequestBody Task task){
        String response= taskService.createTask(task);

        if(response.equals("Task created successfully")){
            messagingTemplate.convertAndSend("/topic/tasks",task);
            return ResponseEntity.ok(response);
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create task");
        }
    }
}
