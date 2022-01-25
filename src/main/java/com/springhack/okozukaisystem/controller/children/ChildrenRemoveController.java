package com.springhack.okozukaisystem.controller.children;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/children/remove")
public class ChildrenRemoveController {

    @GetMapping
    public String doGet() {
        return "children/remove";
    }

}
