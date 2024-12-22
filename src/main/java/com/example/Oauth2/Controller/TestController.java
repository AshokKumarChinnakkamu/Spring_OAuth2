package com.example.Oauth2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String greet(){
        return "Hello There the OAuth2 is working";
    }
}
