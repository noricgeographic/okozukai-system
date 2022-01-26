package com.springhack.okozukaisystem.presentation.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help/removeFinish")
public class HelpRemoveFinishController {

    @PostMapping
    public String doPost() {
        return "help/index";
    }
}
