package com.example.demo_uno.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class User {

        private String name;
        private String lastname;
        private String address;
        private Date dateBirth;
}
