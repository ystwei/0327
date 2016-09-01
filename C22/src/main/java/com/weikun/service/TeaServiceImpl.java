package com.weikun.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.weikun.model.Stu;
import com.weikun.model.Tea;
import com.weikun.model.TeastuKey;

public class TeaServiceImpl implements ITeaService {
	private SqlSessionFactory ssf=null;
	private SqlSession ss=null;
	public TeaServiceImpl(){
		
		String path=HusServiceImpl.class.getClassLoader().getResource("").getPath()+"mybatis.cfg.xml";
		
		
		File file=new File(path);
		
		try {
			ssf=new SqlSessionFactoryBuilder().build(new FileInputStream(file));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		new TeaServiceImpl().selectByExample1();
	}
	@Override
	public List<Tea> selectByExample() {
		// TODO Auto-generated method stub
		ss=ssf.openSession();
		Tea t=new Tea();
		t.setTid(4);
		Tea t1=(Tea)ss.selectOne("com.weikun.dao.TeaMapper.selectByPrimaryKey", t);
		
		List<TeastuKey> list=t1.getSlist();
		
		System.out.println(t1.getTname());
		for(TeastuKey ts :list ){
			
			System.out.println(ts.getSid());
			
			System.out.print(ts.getStu().getSname());
		}
		ss.close();	
		
		return null;
	}
	@Override
	public List<Stu> selectByExample1() {
		// TODO Auto-generated method stub
		ss=ssf.openSession();
		Stu t=new Stu();
		t.setSid(3);
		Stu t1=(Stu)ss.selectOne("com.weikun.dao.StuMapper.selectByPrimaryKey", t);
		
		List<TeastuKey> list=t1.getKlist();
		
		System.out.println(t1.getSname());
		for(TeastuKey ts :list ){
			
			System.out.println(ts.getSid());
			
			System.out.print(ts.getTea().getTname());
		}
		ss.close();	
		
		return null;
	}

}
