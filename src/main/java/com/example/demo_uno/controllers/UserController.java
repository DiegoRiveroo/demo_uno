package com.example.demo_uno.controllers;

import com.example.demo_uno.dto.User;
import com.example.demo_uno.services.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("users")


public class UserController {
    private final UsersService usersService;



    @PostMapping(path = "/create", produces = "application/json")
    User saveUser(@RequestBody User user) {
        return this.usersService.saveUser(user);
    }

}

////aqui solo le cambie la palabra Users por User y se arreglo pero no se si a que User esta asociado ahora?//
