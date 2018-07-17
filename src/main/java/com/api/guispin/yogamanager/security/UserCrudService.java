package com.api.guispin.yogamanager.security;

import java.util.List;
import java.util.Optional;

public interface UserCrudService {

    User save (User user);

    List<User> getAll();

    Optional<User> find(String id);

    Optional<User> findByUsername(String username);
}
