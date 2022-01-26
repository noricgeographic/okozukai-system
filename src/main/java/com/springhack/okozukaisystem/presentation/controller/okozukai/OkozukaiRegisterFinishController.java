package com.springhack.okozukaisystem.presentation.controller.okozukai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/okozukai/registerFinish")
public class OkozukaiRegisterFinishController {

    @PostMapping
    public String doPost() {
        return "index";
    }
}
