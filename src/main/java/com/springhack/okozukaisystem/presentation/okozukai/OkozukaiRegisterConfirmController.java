package com.springhack.okozukaisystem.presentation.okozukai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/okozukai/registerConfirm")
public class OkozukaiRegisterConfirmController {

    @PostMapping
    public String doPost() {
        return "okozukai/register_confirm";
    }

}
