package com.weikun.dao;

import com.weikun.model.Tea;
import com.weikun.model.TeaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeaMapper {
    int countByExample(TeaExample example);

    int deleteByExample(TeaExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Tea record);

    int insertSelective(Tea record);

    List<Tea> selectByExample(TeaExample example);

    Tea selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Tea record, @Param("example") TeaExample example);

    int updateByExample(@Param("record") Tea record, @Param("example") TeaExample example);

    int updateByPrimaryKeySelective(Tea record);

    int updateByPrimaryKey(Tea record);
}