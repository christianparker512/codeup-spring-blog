package com.codeup.springblog.controllers;

import com.codeup.springblog.UserRepository;
import com.codeup.springblog.repository.PostRepository;
import com.codeup.springblog.repository.UsersRepository;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserRepository userDao;
    private UsersRepository users;
    private PostRepository postDao;

    public UserController(UserRepository userDao, UsersRepository users, PostRepository postDao) {
        this.userDao = userDao;
        this.users = users;
        this.postDao = postDao;
    }
}
