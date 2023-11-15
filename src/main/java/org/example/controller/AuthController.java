package org.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.Bean.Auth;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {


    @CrossOrigin
    @RequestMapping("signin")
    public Auth signin(HttpServletRequest request, HttpServletResponse response, @RequestBody Auth body){
        System.out.println(body.getEmail());
        System.out.println(body.getPassword());

        return body;
    }

    @CrossOrigin
    @RequestMapping("signup")
    public Auth signup(HttpServletRequest request, HttpServletResponse response, @RequestBody Auth body){
        System.out.println(body.getEmail());
        System.out.println(body.getPassword());
        System.out.println(body.getFirstName());
        System.out.println(body.getLastName());

        return body;
    }
}
