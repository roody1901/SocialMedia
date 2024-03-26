package com.example.springbootlearn.REST.Services;

import com.example.springbootlearn.REST.Entity.Users;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UsersJpaRepository extends JpaRepository<Users,Integer> {

}
