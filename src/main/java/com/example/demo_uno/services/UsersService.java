package com.example.demo_uno.services;

import com.example.demo_uno.repositories.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsersService {

    private UsersRepository usersRepository;

}