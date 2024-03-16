package com.project.services;

import com.project.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    String registerUser(User user);
    String loginUser(String username, String password);
}
