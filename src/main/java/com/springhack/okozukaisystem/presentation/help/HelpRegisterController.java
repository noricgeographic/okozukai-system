package com.springhack.okozukaisystem.presentation.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help/register")
public class HelpRegisterController {

    @GetMapping
    public String doGet() {
        return "help/register";
    }

}
