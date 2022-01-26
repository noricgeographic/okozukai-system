package com.springhack.okozukaisystem.business.service;

import com.springhack.okozukaisystem.integration.enitity.ChildrenEntity;
import com.springhack.okozukaisystem.integration.mapper.ChildrenMapper;
import com.springhack.okozukaisystem.domain.Child;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChildrenService {
    private ChildrenMapper childrenMapper;

    public ChildrenService(ChildrenMapper childrenMapper) {
        this.childrenMapper = childrenMapper;
    }

    public List<Child> getAll() {
        // DBから取得
        List<ChildrenEntity> allChildren = childrenMapper.selectAll();
        var children = allChildren
                .stream()
                .map(child -> new Child(child.getName(), child.getBirthday()))
                .collect(Collectors.toList());
        return children;
    }
}
