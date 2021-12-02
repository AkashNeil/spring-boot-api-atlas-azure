package io.github.seebaware.springbootapiatlasazure.controller;

import io.github.seebaware.springbootapiatlasazure.model.User;
import io.github.seebaware.springbootapiatlasazure.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/findAll")
    public List<User> findAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/findUserByFirstName")
    @ResponseBody
    public User findUserByFirstName(@RequestParam String firstName) {
        return userService.findUserByFirstName(firstName);
    }

    @GetMapping("/findUserByLastName")
    @ResponseBody
    public User findUserByLastName(@RequestParam String lastName) {
        return userService.findUserByLastName(lastName);
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }


}
