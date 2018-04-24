package com.bestem.controller;

import com.bestem.model.User;
import com.bestem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/signup")
    public void signup(@RequestBody final User user){
        userRepository.save(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
