package com.springhack.okozukaisystem.controller.okozukai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/okozukai/useConfirm")
public class OkozukaiUseConfirmController {

    @PostMapping
    public String doPost() {
        return "okozukai/use_confirm";
    }

}
