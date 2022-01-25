package com.springhack.okozukaisystem.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help/remove")
public class HelpRemoveController {

    @GetMapping
    public String doGet() {
        return "help/remove";
    }

}
