package com.example.Unit_Test.services.implementation;

import com.example.Unit_Test.entities.User;
import com.example.Unit_Test.repositories.UserRepo;
import com.example.Unit_Test.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepository;


    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUser(long id) {
        return Optional.empty();
    }

    @Override
    public User updateUser(long id, User user) {
        user.setId(id);
        return userRepository.saveAndFlush(user);
    }

    @Override
    public boolean deleteUser(long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
