package com.tesch.rpg.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tesch.rpg.entities.User;

public interface IUserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByLogin(String login);
}
