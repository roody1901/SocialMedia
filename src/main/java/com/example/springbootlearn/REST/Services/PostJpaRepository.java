package com.example.springbootlearn.REST.Services;

import com.example.springbootlearn.REST.Entity.Posts;
import com.example.springbootlearn.REST.Entity.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostJpaRepository extends JpaRepository<Posts,Integer> {

}
