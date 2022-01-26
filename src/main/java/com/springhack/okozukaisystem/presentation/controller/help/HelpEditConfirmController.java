package com.springhack.okozukaisystem.presentation.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help/editConfirm")
public class HelpEditConfirmController {

    @PostMapping
    public String doPost() {
        return "help/edit_confirm";
    }

}
