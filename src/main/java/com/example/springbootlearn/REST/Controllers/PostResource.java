package com.example.springbootlearn.REST.Controllers;

import com.example.springbootlearn.REST.Entity.Posts;
import com.example.springbootlearn.REST.Entity.Users;
import com.example.springbootlearn.REST.Services.PostJpaRepository;
import com.example.springbootlearn.REST.Services.UsersJpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PostResource {

    private PostJpaRepository postRepo;
    public PostResource(PostJpaRepository postRepo){
        this.postRepo = postRepo;
    }

    @GetMapping("/post-jpa")
    public List<Posts> getAll(){
        return postRepo.findAll();
    }

    @GetMapping("/post-jpa/{id}")
    public Optional<Posts> getById(@PathVariable Integer id){
        return postRepo.findById(id);
    }
}
