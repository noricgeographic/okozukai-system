package com.springhack.okozukaisystem.presentation.controller.children;

import com.springhack.okozukaisystem.domain.Child;
import com.springhack.okozukaisystem.business.service.ChildrenService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ChildrenController {

    private ChildrenService childrenService;

    public ChildrenController(ChildrenService childrenService) {
        this.childrenService = childrenService;
    }

    @RequestMapping("/children")
    public String index(Model model) {

        // 子どもリストを取得
        List<Child> children = childrenService.getAll();

        // 画面表示
        model.addAttribute("children", children);
        return "children/index";
    }

    @GetMapping("/children/register")
    public String register() {
        return "children/register";
    }

    @PostMapping("/children/registerConfirm")
    public String registerConfirm() {
        return "children/register_confirm";
    }

    @PostMapping("/children/registerFinish")
    public String registerFinish() {
        return "children/index";
    }

    @GetMapping("/children/remove")
    public String doGet() {
        return "children/remove";
    }

    @PostMapping("/children/removeFinish")
    public String removeFinish() {
        return "children/index";
    }

    @GetMapping("/children/edit")
    public String edit() {
        return "children/edit";
    }

    @PostMapping("/children/editConfirm")
    public String editConfirm() {
        return "children/edit_confirm";
    }

    @PostMapping("/children/editFinish")
    public String doPost() {
        return "children/index";
    }
}
