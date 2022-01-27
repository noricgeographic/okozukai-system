package com.springhack.okozukaisystem.presentation.controller.children;

import com.springhack.okozukaisystem.domain.Child;

class ChildrenControllerHelper {

    static Child toChild(ChildRegisterForm childRegisterForm) {
        return new Child(childRegisterForm.getName(), childRegisterForm.getBirthday());
    }

}
