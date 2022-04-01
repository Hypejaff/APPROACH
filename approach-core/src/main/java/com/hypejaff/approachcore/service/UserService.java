package com.hypejaff.approachcore.service;

import com.hypejaff.approachcore.exception.UserNotFoundException;
import com.hypejaff.approachcore.model.User;
import com.hypejaff.approachcore.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user){
        return userRepo.save(user);
    }

    public List<User> findAllUser(){
        return userRepo.findAll();
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }

    public User findUserById(Integer id) throws Throwable {
        return userRepo.findUserById(id).orElseThrow(()
                -> new UserNotFoundException("User not found"));
    }

    public void deleteUser(Integer id){
        userRepo.deleteUserById(id);
    }
}
