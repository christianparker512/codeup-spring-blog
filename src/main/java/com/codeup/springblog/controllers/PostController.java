package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import com.codeup.springblog.repository.PostRepository;
import com.codeup.springblog.repository.UserRepository;
import com.codeup.springblog.services.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class PostController {

    private final PostRepository postsDao;
    private final UserRepository usersDao;
    private final EmailService emailService;

    public PostController(PostRepository postsDao, UserRepository usersDao, EmailService emailService) {
        this.postsDao = postsDao;
        this.usersDao = usersDao;
        this.emailService = emailService;
    }

    @GetMapping(path = "/posts")
    public String index(Model model) {
        List<Post> posts = postsDao.findAll();
        model.addAttribute("title", "All Posts");
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping(path = "/posts/{id}")
    public String indexById(@PathVariable Long id, Model model) {
        model.addAttribute("title", "Single Post");
        model.addAttribute("post", postsDao.getOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String postForm(Model model){
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post) {

        User user = (User) usersDao.findAll().get(0);
        post.setUser(user);

        postsDao.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/delete/{id}")
    public RedirectView deletePost(@PathVariable Long id, Model model) {
        if (postsDao.findById(id).isPresent()) {
            postsDao.deleteById(id);
            return new RedirectView("/posts");
        }
        return new RedirectView("/posts");
    }

    @GetMapping("/posts/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("title", "Edit Post");
        model.addAttribute("post", postsDao.getOne(id));
        return "posts/edit";
    }

    @PostMapping("/posts/edit/{id}")
    public String edited(@PathVariable long id, @ModelAttribute Post post) {
        User user = (User) usersDao.findAll().get(0);
        post.setUser(user);
        postsDao.save(post);
        return "redirect:/posts";
    }

}