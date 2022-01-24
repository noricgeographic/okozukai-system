package com.springhack.okozukaisystem.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/help/register")
@Controller
public class HelpRegisterController {

    @GetMapping
    public String doGet() {
        return "help/register";
    }

}