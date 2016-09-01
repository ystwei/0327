package com.weikun.service;

import java.util.List;

import com.weikun.model.Company;
import com.weikun.model.CompanyExample;
import com.weikun.model.Stu;
import com.weikun.model.Tea;

public interface ITeaService {
	List<Tea> selectByExample();
	List<Stu> selectByExample1();
}
