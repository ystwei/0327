package com.weikun.dao;

import com.weikun.model.TeastuExample;
import com.weikun.model.TeastuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeastuMapper {
    int countByExample(TeastuExample example);

    int deleteByExample(TeastuExample example);

    int deleteByPrimaryKey(TeastuKey key);

    int insert(TeastuKey record);

    int insertSelective(TeastuKey record);

    List<TeastuKey> selectByExample(TeastuExample example);

    int updateByExampleSelective(@Param("record") TeastuKey record, @Param("example") TeastuExample example);

    int updateByExample(@Param("record") TeastuKey record, @Param("example") TeastuExample example);
}