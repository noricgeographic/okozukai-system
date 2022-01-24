package com.springhack.okozukaisystem.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/help/edit")
@Controller("hoge2")
public class EditController {

    @GetMapping
    public String doGet() {
        return "help/edit";
    }

}
