package com.springhack.okozukaisystem.integration.mapper;

import com.springhack.okozukaisystem.integration.enitity.ChildrenEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChildrenMapper {
    List<ChildrenEntity> selectAll();

    int findByName(String name);

    void insert(ChildrenEntity newChild);
}
