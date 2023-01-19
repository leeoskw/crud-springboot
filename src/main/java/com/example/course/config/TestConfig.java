package com.example.course.config;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Lia", "lia@gmail.com", "5555555", "123");
        User u2 = new User(null, "Karina", "ka@example.com", "33333333", "321");

        Iterable<User> users = Arrays.asList(u1, u2);

        userRepository.saveAll(users);
    }
}
