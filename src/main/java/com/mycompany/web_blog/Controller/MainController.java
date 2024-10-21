package com.mycompany.web_blog.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    @GetMapping("")
    public String showHomePage(){
        System.out.println("Hello World");
        return "index";
    }
}
