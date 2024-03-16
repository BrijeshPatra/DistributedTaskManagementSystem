package com.project.services;

import com.project.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUserById(Long id);
    User getUserByUsername(String username);
    String createUser(User user);
    String updateUser(User user);
    String deleteUser(Long id);
}
