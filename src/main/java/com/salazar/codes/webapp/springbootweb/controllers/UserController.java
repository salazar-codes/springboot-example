package com.salazar.codes.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String deatils(Model model) {
        model.addAttribute("title", "Hola Mundo Springboot");
        model.addAttribute("name", "Jimmy");
        model.addAttribute("lastname", "Salazar");
        return "details";
    }

}
