package com.springhack.okozukaisystem.presentation.children;

import com.springhack.okozukaisystem.domain.Child;

class ChildrenControllerHelper {

    static Child toChild(ChildRegisterForm childRegisterForm) {
        return new Child(null, childRegisterForm.getName(), childRegisterForm.getBirthday());
    }

    static Child toChild(ChildEditForm childEditForm) {
        return new Child(childEditForm.getChildId(), childEditForm.getName(), childEditForm.getBirthday());
    }

    static ChildEditForm toEditForm(Child child) {
        var childEditForm = new ChildEditForm();
        childEditForm.setChildId(child.getChildId());
        childEditForm.setName(child.getName());
        childEditForm.setBirthday(child.getBirthday());
        return childEditForm;
    }

}
