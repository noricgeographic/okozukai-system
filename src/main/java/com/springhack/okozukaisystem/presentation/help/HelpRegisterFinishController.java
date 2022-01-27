package com.springhack.okozukaisystem.presentation.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help/registerFinish")
public class HelpRegisterFinishController {

    @PostMapping
    public String doPost() {
        return "help/index";
    }
}
