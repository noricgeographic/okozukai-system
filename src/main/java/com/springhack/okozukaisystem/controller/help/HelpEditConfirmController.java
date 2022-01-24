package com.springhack.okozukaisystem.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/help/editConfirm")
@Controller
public class HelpEditConfirmController {

    @PostMapping
    public String doPost() {
        return "help/edit_confirm";
    }

}
