package com.server.abdelmurserverdemo.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios", schema ="transaccional")

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre_usuario", length = 50, nullable = false)
    @Column(name = "nombre_usuario", length = 50, nullable = false)
    private String name;
    @Column(name = "apellido_usuario", length = 50, nullable = false)
    private String lastname;
    @Column(name = "direccion")
    private String address;
    @Column(name = "fecha_nacimiento", length = 25, nullable = false)
    private Date dateBirth;

}

