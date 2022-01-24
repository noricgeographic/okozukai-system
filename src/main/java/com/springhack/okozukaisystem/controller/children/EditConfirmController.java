package com.springhack.okozukaisystem.controller.children;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/children/editConfirm")
@Controller
public class EditConfirmController {

    @PostMapping
    public String doPost() {
        return "children/edit_confirm";
    }

}
