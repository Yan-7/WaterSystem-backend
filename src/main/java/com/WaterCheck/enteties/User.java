package com.WaterCheck.enteties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", unique = true)
    private String userName;
    
    @Column(name = "password")
    private String password;

    // TODO: 20/08/2023 will be changed into an enum
    @Column(name = "role")
    private String role;

}
