package com.training.repository;

import com.training.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByAccountId(long accountId);
    List<User> findByLastname(String lastname);
}