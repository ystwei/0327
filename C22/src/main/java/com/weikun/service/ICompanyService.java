package com.weikun.service;

import java.util.List;

import com.weikun.model.Company;
import com.weikun.model.CompanyExample;
import com.weikun.model.Father;
import com.weikun.model.FatherExample;

public interface ICompanyService {
	List<Company> selectByExample(CompanyExample example);
}
