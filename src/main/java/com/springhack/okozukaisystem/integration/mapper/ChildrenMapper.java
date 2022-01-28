package com.springhack.okozukaisystem.integration.mapper;

import com.springhack.okozukaisystem.integration.entity.ChildrenEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChildrenMapper {
    List<ChildrenEntity> selectAll();

    ChildrenEntity findById(Long childId);

    List<ChildrenEntity> findByName(String name);

    void insert(ChildrenEntity newChild);

    void update(ChildrenEntity newChild);

    void delete(Long childId);
}
