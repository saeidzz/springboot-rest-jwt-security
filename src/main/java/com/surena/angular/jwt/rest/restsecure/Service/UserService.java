package com.surena.angular.jwt.rest.restsecure.Service;


import com.surena.angular.jwt.rest.restsecure.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService  {
    User save (User user);
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
