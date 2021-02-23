package com.codeup.springblog.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User getUserById(Long id);
    User getUserByUserName(String username);
    User getUserByEmail(String email);
    User findAllByLastNameIsLike(String term);
    User findByUsername(String testUser);
}
