package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class PostController {
    private final PostRepository postsDao;

    public PostController(PostRepository postsDao) {
        this.postsDao = postsDao;
    }

    @GetMapping("/posts")
    public String postsIndex(Model model){
//
        model.addAttribute("posts", postsDao.findAll());

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postView(Model model, @PathVariable long id){
//
        Post post = postsDao.getOne(id);
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/posts/{id}/edit")
    public String viewEditPostForm(@PathVariable long id, Model model){
        model.addAttribute("post", postsDao.getOne(id));
        return "posts/edit";
    }
    @PostMapping("/posts/{id}/edit")
    public String updatePost(@PathVariable long id, @RequestParam String author, @RequestParam String title, @RequestParam String body){

        Post post = new Post (
                id,
                author,
                title,
                body
        );
        postsDao.save(post);
        return "redirect:/posts";
    }

    @PostMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable long id){
        System.out.println("Deleting post...");
        postsDao.deleteById(id);
        return "redirect:/posts";
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