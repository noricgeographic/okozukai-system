package com.springhack.okozukaisystem.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/help/removeFinish")
@Controller("hoge8")
public class RemoveFinishController {

    @PostMapping
    public String doPost() {
        return "help/index";
    }
}
