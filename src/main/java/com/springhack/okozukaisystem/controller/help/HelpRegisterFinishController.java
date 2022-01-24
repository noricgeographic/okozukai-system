package com.springhack.okozukaisystem.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/help/registerFinish")
@Controller
public class HelpRegisterFinishController {

    @PostMapping
    public String doPost() {
        return "help/index";
    }
}
