package com.weikun.dao;

import com.weikun.model.Father;
import com.weikun.model.FatherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FatherMapper {
    int countByExample(FatherExample example);

    int deleteByExample(FatherExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(Father record);

    int insertSelective(Father record);

    List<Father> selectByExample(FatherExample example);

    Father selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") Father record, @Param("example") FatherExample example);

    int updateByExample(@Param("record") Father record, @Param("example") FatherExample example);

    int updateByPrimaryKeySelective(Father record);

    int updateByPrimaryKey(Father record);
}