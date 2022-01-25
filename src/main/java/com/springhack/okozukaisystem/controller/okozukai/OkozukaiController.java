package com.springhack.okozukaisystem.controller.okozukai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/okozukai")
public class OkozukaiController {

    @RequestMapping
    public String index() {
        return "okozukai/index";
    }

}
