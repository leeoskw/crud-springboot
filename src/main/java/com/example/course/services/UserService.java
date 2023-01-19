package com.example.course.services;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAllUsers(){
        return repository.findAll();
    }

    public Optional<User> findUserById(@PathVariable Long id){
        Optional<User> obj = repository.findById(id);
        return repository.findById(id);
    }
}
