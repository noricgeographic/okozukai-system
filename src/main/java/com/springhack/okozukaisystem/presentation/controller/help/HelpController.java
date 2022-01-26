package com.springhack.okozukaisystem.presentation.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help")
public class HelpController {

    @RequestMapping
    public String index() {
        return "help/index";
    }

}
