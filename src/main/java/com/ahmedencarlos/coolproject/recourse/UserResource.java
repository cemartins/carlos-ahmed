package com.ahmedencarlos.coolproject.recourse;

import com.ahmedencarlos.coolproject.model.User;
import com.ahmedencarlos.coolproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    private final UserService userService;

    @Autowired
    public UserResource(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return (List<User>) userService.getAllUsers();
    }
}
