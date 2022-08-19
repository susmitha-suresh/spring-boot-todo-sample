package com.sample.project.demo.service;

import com.sample.project.demo.entity.UserDetails;
import com.sample.project.demo.repository.UserDetailsRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public class UserService {
    @Autowired
    private UserDetailsRepository repository;

    public UserDetails saveUser(UserDetails userDetails) {
        var user = new UserDetails();
        user.setUsername("Sasdv");
        user.setCreatedDate(ZonedDateTime.now());
        user.setModifiedDate(ZonedDateTime.now());
        user.setIsActive(true);
        repository.save(user);
        return user;
    }
}
