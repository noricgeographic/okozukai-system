package com.springhack.okozukaisystem.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help/editFinish")
public class HelpEditFinishController {

    @PostMapping
    public String doPost() {
        return "help/index";
    }
}
