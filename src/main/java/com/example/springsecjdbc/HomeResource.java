package com.example.springsecjdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
        return ("In Home Page");
    }

    @GetMapping("/admin")
    public String admin(){
        return "hello admin how r u?";
    }

    @GetMapping("/user")
    public String user(){
        return "Hello User Welcome";
    }
}
