package com.springhack.okozukaisystem.business;

import com.springhack.okozukaisystem.domain.Child;
import com.springhack.okozukaisystem.integration.entity.ChildrenEntity;
import com.springhack.okozukaisystem.integration.mapper.ChildrenMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
public class ChildrenService {

    private final ChildrenMapper childrenMapper;

    public ChildrenService(ChildrenMapper childrenMapper) {
        this.childrenMapper = childrenMapper;
    }

    public List<Child> getAll() {
        // DBから取得
        List<ChildrenEntity> allChildren = childrenMapper.selectAll();
        var children = allChildren
                .stream()
                .map(child -> new Child(child.getChildId(), child.getName(), child.getBirthday()))
                .collect(Collectors.toList());
        return children;
    }

    /**
     * 登録可能かチェックする
     *
     * @param name
     * @return
     */
    public boolean canRegister(String name) {
        List<ChildrenEntity> sameNameChildren = childrenMapper.findByName(name);
        if (!sameNameChildren.isEmpty()) {
            return false;
        }

        return true;
    }

    public void register(Child newChild) {
        var childrenEntity = new ChildrenEntity(null, newChild.getName(), newChild.getBirthday());
        childrenMapper.insert(childrenEntity);
    }

    public Child get(Long childId) {
        ChildrenEntity childrenEntity = childrenMapper.findById(childId);
        if (Objects.isNull(childrenEntity)) {
            return null;
        }
        return new Child(
                childrenEntity.getChildId(),
                childrenEntity.getName(),
                childrenEntity.getBirthday());
    }

    public void edit(Child newChild) {
        var childrenEntity = new ChildrenEntity(newChild.getChildId(), newChild.getName(), newChild.getBirthday());
        childrenMapper.update(childrenEntity);
    }

    /**
     * 編集可能かチェックする
     */
    public boolean canEdit(Child newChild) {

        List<ChildrenEntity> sameNameChildren = childrenMapper.findByName(newChild.getName());

        if (!sameNameChildren.isEmpty() && !sameNameChildren.get(0).getChildId().equals(newChild.getChildId())) {
            return false;
        }

        return true;
    }

    public void remove(Long childId) {
        childrenMapper.delete(childId);
    }
}
