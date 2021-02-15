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
    public PostController(PostRepository postsDao){
        this.postsDao = postsDao;
    }

    @GetMapping("/posts")
    public String postsIndex(Model model){
        List<Post> postList = postsDao.findAll();
        List<Post> topTen = new ArrayList<>();
        for(int i = 0; i < 10; i ++){
            topTen.add(postList.get(i));
        }

        model.addAttribute("title", "All Posts");
        model.addAttribute("posts", topTen);

        return "posts/index";
    }


    @GetMapping("/posts/{id}")
    public String postView(Model model, @PathVariable long id){
//        get single post by id later
        Post postId = postsDao.getOne(id);
        model.addAttribute("postId", postId);
        model.addAttribute("title", "This Post");
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createForm(Model model){
        model.addAttribute("title", "So you want to create a post?");
        return "Create a post here!";
    }

    @PostMapping("/posts/create")
    public String createPost(@RequestParam(name = "title") STrin)
    public String createPost(){
        return "Creating a new post...";
    }
}