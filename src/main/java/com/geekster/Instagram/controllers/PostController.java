package com.geekster.Instagram.controllers;

import com.geekster.Instagram.models.Post;
import com.geekster.Instagram.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }
    @PostMapping
    public Post savePost(@RequestBody Post post){
        return postService.savePost(post);
    }
}
