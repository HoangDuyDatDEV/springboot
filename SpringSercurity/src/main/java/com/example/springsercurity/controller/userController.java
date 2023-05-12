package com.example.springsercurity.controller;

import com.example.springsercurity.Payload.LoginRequest;
import com.example.springsercurity.configuration.AccountDetails;
import com.example.springsercurity.configuration.JwtTokenProvider;
import com.example.springsercurity.model.Account;
import com.example.springsercurity.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class userController {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    private JwtTokenProvider tokenProvider;

    @PostMapping("/login")
    public String authenticateUser(@RequestBody LoginRequest loginRequest) {

        Account user = accountRepository.findAllByUserName(loginRequest.getUsername());
        String jwt = tokenProvider.generateToken(new AccountDetails(user));
        return jwt;
    }


    @GetMapping("/random")
    public String randomStuff(){
        return "hello";
    }

}
