package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name="ads")
public class Ad {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 100, nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Ad(){}
    public Ad(Long id, String title, String description, int userId, User user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.user = user;
    }

    public Ad( String title, String description, int userId, User user ){
        this.title = title;
        this.description = description;
        this.user = user;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }



}
