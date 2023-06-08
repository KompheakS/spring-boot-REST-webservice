package net.java.springbootrestfulwebservice.service;

import net.java.springbootrestfulwebservice.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUser(Long id);

    List<User> getAllUser();

    User updateUser(User user);

    void deleteUser(Long userId);
}
