package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

@Component
public class PostStartRunner implements CommandLineRuner{

}

@Override
public static void main(String[] args) throws Exception{
    if (userDao.count() !=0){
        return;
    }
    User user= new User();
    user.setUsername("Chris");
    user.setEmail("Chris@gmail.com");
    user.setPassword("password");
    userDao.save(user);

    Post post = new Post();
    post.setTitle(title);
    post.setEmail(body);
    post.setPassword;
}