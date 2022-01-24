package com.springhack.okozukaisystem.controller.children;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/children/register")
@Controller
public class ChildrenRegisterController {

    @GetMapping
    public String doGet() {
        return "children/register";
    }
}