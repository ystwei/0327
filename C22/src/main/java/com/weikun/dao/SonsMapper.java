package com.weikun.dao;

import com.weikun.model.Sons;
import com.weikun.model.SonsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SonsMapper {
    int countByExample(SonsExample example);

    int deleteByExample(SonsExample example);

    int deleteByPrimaryKey(Integer sid);
    
    int deleteByForeignKey(Integer fid);
    
    int insert(Sons record);

    int insertSelective(Sons record);

    List<Sons> selectByExample(SonsExample example);

    Sons selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Sons record, @Param("example") SonsExample example);

    int updateByExample(@Param("record") Sons record, @Param("example") SonsExample example);

    int updateByPrimaryKeySelective(Sons record);

    int updateByPrimaryKey(Sons record);
}