package com.springhack.okozukaisystem.presentation.okozukai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/okozukai/useFinish")
public class OkozukaiUseFinishController {

    @PostMapping
    public String doPost() {
        return "okozukai/index";
    }
}
