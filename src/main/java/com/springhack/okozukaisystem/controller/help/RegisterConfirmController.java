package com.springhack.okozukaisystem.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/help/registerConfirm")
@Controller("hoge4")
public class RegisterConfirmController {

    @PostMapping
    public String doPost() {
        return "help/register_confirm";
    }

}
