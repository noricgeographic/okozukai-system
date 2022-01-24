package com.springhack.okozukaisystem.controller.children;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChildrenController {

    @RequestMapping("/children")
    public String index() {
        return "children/index";
    }

}
