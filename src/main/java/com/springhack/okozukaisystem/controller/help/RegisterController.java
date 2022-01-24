package com.springhack.okozukaisystem.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/help/register")
@Controller("hoge5")
public class RegisterController {

    @GetMapping
    public String doGet() {
        return "help/register";
    }

}
