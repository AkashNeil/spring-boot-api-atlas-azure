package io.github.seebaware.springbootapiatlasazure.service;

import io.github.seebaware.springbootapiatlasazure.model.User;
import io.github.seebaware.springbootapiatlasazure.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepo userRepo;

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User findUserByFirstName(String firstName) {
        return userRepo.findUserByFirstName(firstName);
    }

    public User findUserByLastName(String lastName) {
        return userRepo.findUserByLastName(lastName);
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

}
