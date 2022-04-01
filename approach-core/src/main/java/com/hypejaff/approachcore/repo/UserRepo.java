package com.hypejaff.approachcore.repo;

import com.hypejaff.approachcore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {
    void deleteUserById(Integer id);
    Optional<User> findUserById(Integer id);
}
