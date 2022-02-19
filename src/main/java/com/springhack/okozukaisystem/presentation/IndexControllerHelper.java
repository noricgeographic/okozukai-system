package com.springhack.okozukaisystem.presentation;

import com.springhack.okozukaisystem.session.SessionKeys;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

public class IndexControllerHelper {
    public static void setLoginDatetime(HttpSession session) {
        Object loginDateTime = session.getAttribute(SessionKeys.LOGIN_DATETIME);
        if (loginDateTime == null) {
            session.setAttribute(SessionKeys.LOGIN_DATETIME, LocalDateTime.now());
        }
    }
}
