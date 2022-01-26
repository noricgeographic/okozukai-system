package com.springhack.okozukaisystem.presentation.controller.children;

import com.springhack.okozukaisystem.domain.Child;
import com.springhack.okozukaisystem.business.service.ChildrenService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/children")
public class ChildrenController {

    private ChildrenService childrenService;

    public ChildrenController(ChildrenService childrenService) {
        this.childrenService = childrenService;
    }

    @RequestMapping
    public String index(Model model) {

        List<Child> children = childrenService.getAll();
        model.addAttribute("children", children);

        return "children/index";
    }

}
