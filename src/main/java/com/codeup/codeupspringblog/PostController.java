package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String postsHome(){
        return"Posts index Page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsHome(@PathVariable long id){
        return "viewing post at id: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsForm(){
        return "Form for create new posts.";
    }

    @PostMapping("/posts/create")
    public void createPost(){
        // something was created add a line here later.
    }



}