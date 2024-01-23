package com.salazar.codes.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salazar.codes.webapp.springbootweb.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details2")
    public Map<String, Object> deatils() {

        User user = new User("Jimmy", "Salazar");

        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Springboot");
        body.put("user", user);
        return body;
    }

}