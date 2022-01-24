package com.springhack.okozukaisystem.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/help/editConfirm")
@Controller("hoge1")
public class EditConfirmController {

    @PostMapping
    public String doPost() {
        return "help/edit_confirm";
    }

}
