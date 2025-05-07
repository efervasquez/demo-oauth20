package com.example.oauth.controller;

import com.example.oauth.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    private final UserService userService;

    public StartController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(){
        return "Hello!";
    }

    @GetMapping("/secured")
    public String secured(){
        return userService.addUser();
    }

    @GetMapping("/test-db")
    public String testDb() {
        try {
            userService.addUser();
            return "Conexión a la base de datos exitosa!";
        } catch (Exception e) {
            return "Error en la conexión: " + e.getMessage();
        }
    }
}
