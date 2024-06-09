package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Jonas", "jonasdurau@gmail.com", "41996775078", "nova_senha");
        return ResponseEntity.ok().body(u);
    }
}
