package com.springhack.okozukaisystem.presentation.children;

import com.springhack.okozukaisystem.business.ChildrenService;
import com.springhack.okozukaisystem.domain.Child;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Objects;

@Controller
public class ChildrenController {

    private final ChildrenService childrenService;

    public ChildrenController(ChildrenService childrenService) {
        this.childrenService = childrenService;
    }

    @RequestMapping("/children")
    public String index(Model model) {

        // 子どもリストを取得
        List<Child> children = childrenService.getAll();

        // 画面表示
        Object message = model.getAttribute("message");
        if (message != null) {
            model.addAttribute("message", String.valueOf(message));
        }
        model.addAttribute("children", children);
        return "children/index";
    }

    @GetMapping("/children/register")
    public String register(Model model) {
        model.addAttribute("childRegisterForm", new Child(null, null, null));
        return "children/register";
    }

    @PostMapping("/children/registerConfirm")
    public String registerConfirm(@Validated ChildRegisterForm childRegisterForm, BindingResult bindingResult, Model model) {

        // 入力チェック
        if (bindingResult.hasErrors()) {
            return "children/register";
        }

        // 登録可否チェック
        boolean canRegister = childrenService.canRegister(childRegisterForm.getName());
        if (!canRegister) {
            model.addAttribute("message", "既に同じ名前が登録されています。");
            return "children/register";
        }

        // 画面表示
        return "children/register_confirm";
    }

    @PostMapping("/children/registerFinish")
    public String registerFinish(@Validated ChildRegisterForm childRegisterForm, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {

        // 入力チェック
        if (bindingResult.hasErrors()) {
            return "children/register";
        }

        // 登録可否チェック
        boolean canRegister = childrenService.canRegister(childRegisterForm.getName());
        if (!canRegister) {
            model.addAttribute("message", "既に同じ名前が登録されています。");
            return "children/register";
        }

        // 登録実行
        var child = ChildrenControllerHelper.toChild(childRegisterForm);
        childrenService.register(child);

        // 画面遷移
        redirectAttributes.addFlashAttribute("message", child.getName() + "を登録しました。");
        return "redirect:/children";
    }

    @GetMapping("/children/remove")
    public String remove(Long id, Model model) {

        // 削除チェック
        Child child = childrenService.get(id);
        if (Objects.isNull(child)) {
            model.addAttribute("message", "選択した子どもが存在しません。");
            return "children/index";
        }

        // 画面遷移
        model.addAttribute("child", child);
        return "children/remove";
    }

    @PostMapping("/children/removeFinish")
    public String removeFinish(Long childId, Model model, RedirectAttributes redirectAttributes) {

        // 削除チェック
        Child child = childrenService.get(childId);
        if (Objects.isNull(child)) {
            model.addAttribute("message", "選択した子どもが存在しません。");
            return "children/index";
        }

        // 削除実行
        childrenService.remove(childId);

        // 画面遷移
        redirectAttributes.addFlashAttribute("message", "子ども削除しました。");
        return "redirect:/children";
    }

    @GetMapping("/children/edit")
    public String edit(Long id, Model model) {

        // 編集可否チェック
        Child child = childrenService.get(id);
        if (Objects.isNull(child)) {
            model.addAttribute("message", "選択した子どもが存在しません。");
            return "children/index";
        }

        // 画面遷移
        ChildEditForm childEditForm = ChildrenControllerHelper.toEditForm(child);
        model.addAttribute("childEditForm", childEditForm);
        return "children/edit";
    }

    @PostMapping("/children/editConfirm")
    public String editConfirm(@Validated ChildEditForm childEditForm, BindingResult bindingResult, Model model) {

        // 入力チェック
        if (bindingResult.hasErrors()) {
            return "children/edit";
        }

        // 編集可否チェック
        var child = ChildrenControllerHelper.toChild(childEditForm);
        boolean canRegister = childrenService.canEdit(child);
        if (!canRegister) {
            model.addAttribute("message", "既に同じ名前が登録されています。");
            return "children/edit";
        }

        // 画面遷移
        return "children/edit_confirm";
    }

    @PostMapping("/children/editFinish")
    public String editFinish(@Validated ChildEditForm childEditForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        // 入力チェック
        if (bindingResult.hasErrors()) {
            return "children/edit";
        }

        // 編集実行
        var child = ChildrenControllerHelper.toChild(childEditForm);
        childrenService.edit(child);

        // 画面遷移
        redirectAttributes.addFlashAttribute("message", child.getName() + "を編集しました。");
        return "redirect:/children";
    }
}
