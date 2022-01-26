package com.springhack.okozukaisystem.integration.mapper;

import com.springhack.okozukaisystem.integration.enitity.ChildrenEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChildrenMapper {
    public List<ChildrenEntity> selectAll();
}
