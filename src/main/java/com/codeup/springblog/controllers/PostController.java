package com.codeup.springblog.controllers;


import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {


    @GetMapping("/posts")
    public String postsIndex(Model model){
        Post post1 = new Post("When one door closes, another opens...", "", 1);
        Post post2 = new Post("So it begins...Again", "Life happens...I know. I started Codeup the first time and made it through the first month. Casey got sick and then it was too much. Sometimes you need to take a step back and restart. It turned out for the best.  ", 2);
        Post post3 = new Post("Sea legs", "I remember when I ran a marathon. I walked for a minute and then ran for a minute. It was tough getting my legs back. I'm feeling like this is the way that this coding is for me. ", 3);

    List<Post> postList = new ArrayList<>();
        postList.add(post1);
        postList.add(post2);
        postList.add(post3);

        model.addAttribute("title", "All Posts");
        model.addAttribute("posts", postList);

        return "posts/index";
}

    @GetMapping("/posts/{id}")
    public String postView(Model model, @PathVariable String id) {
//        get single post by id later
        Post post = new Post("First Post", "This is my first post", 1);
        model.addAttribute("title", "Single Posts");
        model.addAttribute("post", post);
        return "posts/show";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String postForm(){
        return "Create a post here!";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "Creating a new post...";
    }
}