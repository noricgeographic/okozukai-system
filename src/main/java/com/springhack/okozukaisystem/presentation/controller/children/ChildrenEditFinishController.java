package com.springhack.okozukaisystem.presentation.controller.children;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/children/editFinish")
public class ChildrenEditFinishController {

    @PostMapping
    public String doPost() {
        return "children/index";
    }
}
