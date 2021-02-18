package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    private final PostRepository postsDao;

    public PostController(PostRepository postsDao) {
        this.postsDao = postsDao;
    }

    @GetMapping("/posts")
    public String postsIndex(Model model){
//        Post post1 = new Post(1,"this is the author", "this is the title", "This is the body");
//        Post post2 = new Post(2,"this is the author", "this is the title", "This is the body");
//        Post post3 = new Post(3,"this is the author", "this is the title", "This is the body");
//
//        List<Post> postList = new ArrayList<>();
//        postList.add(post1);
//        postList.add(post2);
//        postList.add(post3);

//        model.addAttribute("title", "All Posts");
        model.addAttribute("posts", postsDao.findAll());

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postView(Model model, @PathVariable long id){
//        get single post by id later
//        Post post = new Post(1, "This is my first post", "try this");
//        model.addAttribute("title", "Single Posts");
        Post post = postsDao.getOne(id);
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postForm(){
        return "Create a post here! this one is showing";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "Creating a new post...";
    }
}