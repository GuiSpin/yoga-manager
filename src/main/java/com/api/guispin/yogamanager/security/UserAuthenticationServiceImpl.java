package com.api.guispin.yogamanager.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {

    @Autowired
    UserCrudService userCrudService;

    @Override
    public Optional<String> login(String username, String password) {
        final String uuid = UUID.randomUUID().toString();
        final User user = new User(uuid, username,password);

        userCrudService.findByUsername(username);

        return Optional.of(uuid);
    }

    @Override
    public Optional<User> findByToken(String token) {
        return userCrudService.find(token);
    }

    @Override
    public void logout(User user) {

    }
}
