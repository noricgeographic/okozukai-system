package com.springhack.okozukaisystem.presentation.controller.okozukai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/okozukai/use")
public class OkozukaiUseController {

    @RequestMapping
    public String index() {
        return "okozukai/use";
    }

}
