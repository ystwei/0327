package com.weikun.service;

import java.util.List;

import com.weikun.model.Hus;
import com.weikun.model.HusExample;

public interface IHusService {
	int deleteByPrimaryKey(Integer hid);

	int insert(Hus record);

	List<Hus> selectByExample(HusExample example);

	Hus selectByPrimaryKey(Integer hid);

	int updateByPrimaryKey(Hus record);
	List<Hus> selectAll();
	void selectForPro();


}
