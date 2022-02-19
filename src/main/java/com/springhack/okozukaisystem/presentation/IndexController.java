package com.springhack.okozukaisystem.presentation;

import com.springhack.okozukaisystem.session.SessionKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping
    public String index(HttpSession session)
    {

        // セッションにログイン時刻をセット
        IndexControllerHelper.setLoginDatetime(session);

        // トップページを表示
        return "index";
    }
}
