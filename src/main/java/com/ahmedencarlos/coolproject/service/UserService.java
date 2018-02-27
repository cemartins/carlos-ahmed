package com.ahmedencarlos.coolproject.service;

import com.ahmedencarlos.coolproject.model.User;
import com.ahmedencarlos.coolproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
