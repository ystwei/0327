package com.weikun.dao;

import com.weikun.model.Hus;
import com.weikun.model.HusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HusMapper {
    int countByExample(HusExample example);

    int deleteByExample(HusExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(Hus record);

    int insertSelective(Hus record);

    List<Hus> selectByExample(HusExample example);
    
    List<Hus> selectAll();
    
    void selectForPro();

    Hus selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") Hus record, @Param("example") HusExample example);

    int updateByExample(@Param("record") Hus record, @Param("example") HusExample example);

    int updateByPrimaryKeySelective(Hus record);

    int updateByPrimaryKey(Hus record);
}