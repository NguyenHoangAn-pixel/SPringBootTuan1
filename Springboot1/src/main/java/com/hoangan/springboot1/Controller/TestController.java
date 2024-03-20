package com.hoangan.springboot1.Controller;

import com.hoangan.springboot1.request.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String heloo(){
        return "Hello World";
    }
    @PostMapping("/User")
    public String helloUser(@RequestBody User body){
        System.out.println(body.getAge());
        return body.getName();
}
}
