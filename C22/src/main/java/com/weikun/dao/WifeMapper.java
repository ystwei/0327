package com.weikun.dao;

import com.weikun.model.Wife;
import com.weikun.model.WifeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WifeMapper {
    int countByExample(WifeExample example);

    int deleteByExample(WifeExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(Wife record);

    int insertSelective(Wife record);

    List<Wife> selectByExample(WifeExample example);

    Wife selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") Wife record, @Param("example") WifeExample example);

    int updateByExample(@Param("record") Wife record, @Param("example") WifeExample example);

    int updateByPrimaryKeySelective(Wife record);

    int updateByPrimaryKey(Wife record);
}