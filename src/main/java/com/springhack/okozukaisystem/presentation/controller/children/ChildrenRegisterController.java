package com.springhack.okozukaisystem.presentation.controller.children;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/children/register")
public class ChildrenRegisterController {

    @GetMapping
    public String doGet() {
        return "children/register";
    }
}
