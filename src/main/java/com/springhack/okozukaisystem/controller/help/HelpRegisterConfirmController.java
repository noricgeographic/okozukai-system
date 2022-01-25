package com.springhack.okozukaisystem.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help/registerConfirm")
public class HelpRegisterConfirmController {

    @PostMapping
    public String doPost() {
        return "help/register_confirm";
    }

}
