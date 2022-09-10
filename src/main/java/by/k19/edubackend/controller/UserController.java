package by.k19.edubackend.controller;

import by.k19.edubackend.model.User;
import by.k19.edubackend.service.IService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController {

    private IService<User> userService;

    @GetMapping("/users")
    public Collection<User> getUsers() {
        return userService.findAll();
    }
}
