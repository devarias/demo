package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users") // GET
    public String users(@RequestParam(value="id", defaultValue="") String id) {
        if ("".equals(id)) {
            return String.format("Getting users information");
        }
        return String.format("User information with id %s", id);
    }

    @PostMapping("/users") // POST
    public String createUser() {
        return String.format("User created");
    }

    @PutMapping("/users")  // PUT
    public String updateUser(@RequestParam(value="id") String id) {
        return String.format("User with id %s updated", id);
    }

    @DeleteMapping("/users")  // DELETE
    public String deleteUser(@RequestParam(value="id") String id) {
        return String.format("User with id %s deleted", id);
    }

    // Javascript Standar Object Notation

    // {
    // name: "Valen"
    // }

}
