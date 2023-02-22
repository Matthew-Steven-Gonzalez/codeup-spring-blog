package com.codeup.codeupspringblog.models;

import java.util.ArrayList;

public class Ad {

    private long id;

    private String title;

    private String description;

    private int userId;

    public Ad(){}
    public Ad(Long id, String title, String description, int userId, ArrayList<String> categories) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.userId = userId;
        this.categories = categories;
    }

    public Ad( String title, String description, int userId, ArrayList<String> categories) {
        this.title = title;
        this.description = description;
        this.userId = userId;
        this.categories = categories;
    }

    private ArrayList<String> categories;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }
}
