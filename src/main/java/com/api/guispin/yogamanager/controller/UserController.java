package com.api.guispin.yogamanager.controller;

import com.api.guispin.yogamanager.security.User;
import com.api.guispin.yogamanager.security.UserAuthenticationService;
import com.api.guispin.yogamanager.security.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.reflect.Modifier.PRIVATE;

@RestController
@RequestMapping("/public/users")
public class UserController {
    @Autowired
    private UserAuthenticationService authentication;

    @Autowired
    private UserCrudService users;

    @PostMapping("/register")
    public String register(
            @RequestParam("username") final String username,
            @RequestParam("password") final String password) {
        users
                .save(
                        new User(username, username, password)

                );

        return login(username, password);
    }

    @PostMapping("/login")
    public String login(
            @RequestParam("username") final String username,
            @RequestParam("password") final String password) {
        return authentication
                .login(username, password)
                .orElseThrow(() -> new RuntimeException("invalid login and/or password"));
    }

    @GetMapping
    public List<User> getAllUsers (){
      return users.getAll();
    }
}