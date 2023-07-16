package com.geekster.Instagram.services;


import com.geekster.Instagram.models.Post;
import com.geekster.Instagram.repo.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostService {

    @Autowired
    IPostRepository postRepository;

    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    public Post savePost(Post post) {
        return postRepository.save(post);
    }
}
