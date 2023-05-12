package com.example.springsercurity.model;


import lombok.*;

import javax.persistence.*;
@Data
@Entity
@Table(name = "accounts")

public class Account {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username", unique = true, nullable = false)
    private String userName;

    @Column(name = "password", nullable = false)
    private String passWord;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;



}
