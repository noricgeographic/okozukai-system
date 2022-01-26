package com.springhack.okozukaisystem.presentation.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help/edit")
public class HelpEditController {
    @GetMapping
    public String doGet() {
        return "help/edit";
    }
}
