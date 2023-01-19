package com.example.course.resources;

import com.example.course.entities.User;
import com.example.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){

//        User u1 = new User(10L, "Gilberto", "gil@gmail.com", "555555", "1234");

        List<User> users = userService.findAllUsers();

        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findUserById(@PathVariable Long id){
//        return userService.findUserById(id);
        Optional<User> user = userService.findUserById(id);
        return ResponseEntity.ok().body(user);
    }
}
