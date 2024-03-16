package com.project.controllers;

import com.project.entity.User;
import com.project.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user){
        return authService.registerUser(user);
    }
    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password) {
        return authService.loginUser(username, password);
    }
}
