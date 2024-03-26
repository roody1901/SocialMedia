package com.example.springbootlearn.REST.Entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.implementation.bytecode.StackManipulation;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

//@JsonFilter("SomeUserFilter")

@Entity
@Table(name = "users")
public class Users {



   // @JsonIgnore //static filtering
    @Id
    @GeneratedValue
    private Integer userId;

    private String name;

   private LocalDate DateOfBirth;

   @OneToMany(mappedBy = "users")
   @JsonIgnore
 private List<Posts> posts;

    public Users(Integer userId, String name, LocalDate DateOfBirth){
        this.userId = userId;
        this.name= name;
        this.DateOfBirth = DateOfBirth;
    }

    public Users() {

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                '}';
    }
}
