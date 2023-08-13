package com.dev.springboottesting.repository;

import com.dev.springboottesting.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordTokenRepository extends JpaRepository<Token, String> {
    Token findByToken(String token);
}