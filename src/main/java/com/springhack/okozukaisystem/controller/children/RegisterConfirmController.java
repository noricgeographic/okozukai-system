package com.springhack.okozukaisystem.controller.children;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/children/registerConfirm")
@Controller
public class RegisterConfirmController {

    @PostMapping
    public String doPost() {
        return "children/register_confirm";
    }

}
