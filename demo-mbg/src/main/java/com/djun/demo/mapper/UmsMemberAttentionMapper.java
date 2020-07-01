package com.djun.demo.mapper;

import com.djun.demo.model.UmsMemberAttention;
import com.djun.demo.model.UmsMemberAttentionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberAttentionMapper {
    long countByExample(UmsMemberAttentionExample example);

    int deleteByExample(UmsMemberAttentionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsMemberAttention record);

    int insertSelective(UmsMemberAttention record);

    List<UmsMemberAttention> selectByExample(UmsMemberAttentionExample example);

    UmsMemberAttention selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsMemberAttention record, @Param("example") UmsMemberAttentionExample example);

    int updateByExample(@Param("record") UmsMemberAttention record, @Param("example") UmsMemberAttentionExample example);

    int updateByPrimaryKeySelective(UmsMemberAttention record);

    int updateByPrimaryKey(UmsMemberAttention record);
}