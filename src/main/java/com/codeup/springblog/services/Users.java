package com.codeup.springblog.services;

import com.codeup.springblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Users extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
