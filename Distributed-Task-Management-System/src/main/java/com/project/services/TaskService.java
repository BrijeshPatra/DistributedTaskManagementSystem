package com.project.services;

import com.project.entity.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {
    String createTask(Task task);
    String assignTask(Long taskId, Long userId);
}
