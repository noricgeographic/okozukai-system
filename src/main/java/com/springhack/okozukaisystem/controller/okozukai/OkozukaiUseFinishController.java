package com.springhack.okozukaisystem.controller.okozukai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/okozukai/useFinish")
@Controller
public class OkozukaiUseFinishController {

    @PostMapping
    public String doPost() {
        return "okozukai/index";
    }
}
