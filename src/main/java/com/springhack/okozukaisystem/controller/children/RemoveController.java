package com.springhack.okozukaisystem.controller.children;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/children/remove")
@Controller
public class RemoveController {

    @GetMapping
    public String doGet() {
        return "children/remove";
    }

}
