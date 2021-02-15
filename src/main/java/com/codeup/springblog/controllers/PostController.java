package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class PostController {

    private final PostRepository postsDao;
    Methods m = new Methods();

    public PostController(PostRepository postsDao){
        this.postsDao = postsDao;
    }

    @GetMapping("/posts")
    public String allPosts(Model model){
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
    public String createPost(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body, @RequestParam(name = "author") String author, Model model){
        Post newPost = new Post();
        newPost.setDate(new Date());
        newPost.setAuthor(m.cap(author));
        newPost.setBody(body);
        newPost.setTitle(title);
        postsDao.save(newPost);
        Post myPost = postsDao.getOne(newPost.getId());
        model.addAttribute("myPost", myPost);
        model.addAttribute("title", "This Post");
        return "posts/show";
    }
    @GetMapping("/posts/search/{searchValue}")
    public String searchPost(@PathVariable String searchValue, Model model){
        System.out.println(searchValue);
        Post post = postsDao.findPostByTitle(searchValue);
        model.addAttribute("myPost", post);
        model.addAttribute("title", "Viewing Searched Post");
        return "posts/show";
    }
    @GetMapping("/posts/delete/{id}")
    public String deletePost(Model model, @PathVariable long id){
        Post thisPost = postsDao.getOne(id);
        postsDao.delete(thisPost);
        return allPosts(model);
    }
    @PostMapping("/posts/edit")
    public String editThePost(Model model, @RequestParam(name = "title") String title, @RequestParam(name = "body") String body, @RequestParam(name = "author") String author, @RequestParam(name = "currId") long id){
        Post currPost = postsDao.getOne(id);
        currPost.setTitle(title);
        currPost.setBody(body);
        currPost.setAuthor(m.cap(author));
        currPost.setDate(new Date());
        postsDao.save(currPost);
        return allPosts(model);
    }
}