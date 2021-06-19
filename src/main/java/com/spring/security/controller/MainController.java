package com.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class MainController {

    @GetMapping("/main")
    public String main(){
        return "index";
    }

    @GetMapping("/profile")
    public String profile(){
        return "profile/index";
    }

    @GetMapping("/management")
    public String management(){
        return "management/index";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin/index";
    }
}
