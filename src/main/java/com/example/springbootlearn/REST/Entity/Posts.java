package com.example.springbootlearn.REST.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity(name = "posts")
public class Posts {
    @Id
    @GeneratedValue
    private Integer post_id;
    @Column
    private String description;


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Users users;

    public Posts(int post_id, String description) {
        this.post_id = post_id;
        this.description = description;
    }

    public Posts() {

    }

    public Integer getPostId() {
        return post_id;
    }

    public void setPostId(Integer postId) {
        this.post_id = postId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "postId=" + post_id +
                ", description='" + description + '\'' +
                '}';
    }
}
