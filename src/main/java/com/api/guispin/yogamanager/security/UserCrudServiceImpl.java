package com.api.guispin.yogamanager.security;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

@Service
public class UserCrudServiceImpl implements UserCrudService {
    Map<String, User> users = new HashMap<>();

    @Override
    public User save(final User user) {
        return users.put(user.getUsername(), user);
    }

    @Override
    public List<User> getAll() {
        return users.values()
                .stream()
                .collect(Collectors.toList());
    }

    @Override
    public Optional<User> find(final String id) {
        return ofNullable(users.get(id));
    }

    @Override
    public Optional<User> findByUsername(final String username) {
        return users
                .values()
                .stream()
                .filter(u -> Objects.equals(username, u.getUsername()))
                .findFirst();
    }

}
