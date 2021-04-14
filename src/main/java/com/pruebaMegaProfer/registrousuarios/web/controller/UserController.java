package com.pruebaMegaProfer.registrousuarios.web.controller;

import com.pruebaMegaProfer.registrousuarios.domain.User;
import com.pruebaMegaProfer.registrousuarios.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/user/{id}")
    public List<User> getById(@PathVariable("id") int userId){

        return userService.getById(userId);
    }

    @GetMapping("/{identify}")
    public  List<User> getByIdentify(@PathVariable("identify") String identify){
        return userService.getByIdentify(identify);
    }

    @PostMapping("/save")
    public User save(@RequestBody User user){
        return  userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int userId){

    }
}
