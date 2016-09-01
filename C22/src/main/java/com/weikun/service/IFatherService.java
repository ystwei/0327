package com.weikun.service;

import java.util.List;

import com.weikun.model.Father;
import com.weikun.model.FatherExample;
import com.weikun.model.Hus;
import com.weikun.model.HusExample;
import com.weikun.model.Sons;

public interface IFatherService {
	int deleteByPrimaryKey(Integer fid);
	
	int deleteByForeignKey(Integer fid);//Í¨¹ýÍâ¼üÉ¾³ýsons
	
	int insert(Father record);

	List<Father> selectByExample(FatherExample example);
	
	Sons selectByPrimaryKeyBySons() ;
	
	Father selectByPrimaryKey(Integer hid);

	int updateByPrimaryKey(Father record);
	
	List<Father> selectAll();
	
	void selectForPro();
}
