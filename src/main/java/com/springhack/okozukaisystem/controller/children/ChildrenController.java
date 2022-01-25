package com.springhack.okozukaisystem.controller.children;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/children")
public class ChildrenController {

    @RequestMapping
    public String index() {
        return "children/index";
    }

}
