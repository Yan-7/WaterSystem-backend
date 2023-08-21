package com.WaterCheck.service;

import com.WaterCheck.enteties.User;
import com.WaterCheck.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }


}
