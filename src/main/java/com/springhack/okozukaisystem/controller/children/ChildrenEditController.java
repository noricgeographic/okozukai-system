package com.springhack.okozukaisystem.controller.children;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/children/edit")
@Controller
public class ChildrenEditController {

    @GetMapping
    public String doGet() {
        return "children/edit";
    }

}
