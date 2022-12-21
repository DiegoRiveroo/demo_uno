package com.example.demo_uno.services;

import com.example.demo_uno.repositories.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;

    public Users saveUser(User userDto) {
        Users userEntity = new Users();
        userEntity.setName(userDto.getName());
        userEntity.setLastname(userDto.getLastname());
        userEntity.setAddress(userDto.getAddress());
        userEntity.setDateBirth(userDto.getDateBirth());
        return this.usersRepository.save(userEntity);
    }

}



