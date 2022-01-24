package com.springhack.okozukaisystem.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/help/remove")
@Controller("hoge7")
public class RemoveController {

    @GetMapping
    public String doGet() {
        return "help/remove";
    }

}
