package com.example.springbootlearn.REST.Controllers;

import com.example.springbootlearn.REST.Entity.Users;
import com.example.springbootlearn.REST.Services.UsersJpaRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserResource {

    private UsersJpaRepository userRepo;
    public  UserResource( UsersJpaRepository userRepo){
        this.userRepo = userRepo;
    }

    @GetMapping("/user-jpa")
    public List<Users> getAll(){
        return userRepo.findAll();
    }

//    @GetMapping("/user-pagi")
//    public List<Users> getBySearch(String searchTerm){
//        return userRepo.findBy();
//    }

    @GetMapping("/users/{id}")
    public Optional<Users> getById(@PathVariable Integer id){
        return userRepo.findById(id);
    }
}
