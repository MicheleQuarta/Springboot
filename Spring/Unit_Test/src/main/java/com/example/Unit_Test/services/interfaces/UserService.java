package com.example.Unit_Test.services.interfaces;
import com.example.Unit_Test.entities.User;

import java.util.List;
import java.util.Optional;
public interface UserService {
    User createUser(User user);

    List<User> getAllUsers();

    Optional<User> findUser(long id);

    User updateUser(long id, User user);

    boolean deleteUser(long id);

}
