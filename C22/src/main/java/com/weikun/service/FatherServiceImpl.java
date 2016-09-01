package com.weikun.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.weikun.model.Father;
import com.weikun.model.FatherExample;
import com.weikun.model.Sons;

public class FatherServiceImpl implements IFatherService {
	private SqlSessionFactory ssf;
	private SqlSession ss;
	public FatherServiceImpl(){
		
		InputStream is;
		try {
			is = new FileInputStream(new File(FatherServiceImpl.class.getClassLoader().getResource("").getPath()+"mybatis.cfg.xml"));
			
			
			ssf=new SqlSessionFactoryBuilder().build(is);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
			
	public static void main(String[] args) {
		new FatherServiceImpl().selectAll();
	}
	@Override
	public int deleteByPrimaryKey(Integer hid) {
		// TODO Auto-generated method stub
		ss=ssf.openSession();
		
		Sons s=new Sons();
		s.setFid(4);//这种方法可以删除全部从表数据，在删除主表数据，
		
		ss.delete("com.weikun.dao.SonsMapper.deleteByPrimaryKey", s);
		
		
		Father f=new Father();
		f.setFid(4);
		ss.delete("com.weikun.dao.FatherMapper.deleteByPrimaryKey", f);
		
	
		ss.commit();
		ss.close();
		return 0;
	}

	@Override
	public int insert(Father record) {
		// TODO Auto-generated method stub
		ss=ssf.openSession();
		
		Father f=new Father();
		f.setFname("哈理工");
		ss.insert("com.weikun.dao.FatherMapper.insert", f);
		
		Sons s=new Sons();
		s.setSname("黑龙江大学");
		ss.insert("com.weikun.dao.SonsMapper.insert", s);
		
		
		ss.commit();
		ss.close();
		return 0;
		
		
		
	}

	@Override
	public List<Father> selectByExample(FatherExample example) {
		// TODO Auto-generated method stub
		ss=ssf.openSession();
		FatherExample fe=new FatherExample();
		
		fe.createCriteria().andFidEqualTo(24);
		
		Father f=(Father)ss.selectOne("com.weikun.dao.FatherMapper.selectByExample",fe);
		System.out.println(f.getFname());
		ss.close();
		
		return null;
	}

	@Override
	public Father selectByPrimaryKey(Integer hid) {
		// TODO Auto-generated method stub
		
		ss=ssf.openSession();
		
		Father f=new Father();
		f.setFid(24);
		Father f1=(Father)ss.selectOne("com.weikun.dao.FatherMapper.selectByPrimaryKey", f);
		
		System.out.print(f1.getFname());
		
		List <Sons> list=f1.getSlist();
		
		for(Sons s :list){
			System.out.print(s.getSname());
			
		}
		
		ss.close();
		
		
		return null;
	}

	@Override
	public int updateByPrimaryKey(Father record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Father> selectAll() {
		// TODO Auto-generated method stub
		
		ss=ssf.openSession();
		FatherExample fe=new FatherExample();
		
		fe.createCriteria().andFidIsNotNull();
		
		List <Father>list=ss.selectList("com.weikun.dao.FatherMapper.selectByExample",fe);
		
		for(Father f :list){
			
			System.out.print(f.getFname());
		}
		ss.close();
		return null;
	}

	@Override
	public void selectForPro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteByForeignKey(Integer fid) {
		// TODO Auto-generated method stub
		ss=ssf.openSession();
		
		Sons s=new Sons();
		s.setSid(9);
		
		ss.delete("com.weikun.dao.SonsMapper.deleteByPrimaryKey", s);
		
		
		Father f=new Father();
		f.setFid(13);
		ss.delete("com.weikun.dao.FatherMapper.deleteByPrimaryKey", f);
		
	
		ss.commit();
		ss.close();
		return 0;
	}

	@Override
	public Sons selectByPrimaryKeyBySons() {
		// TODO Auto-generated method stub
		ss=ssf.openSession();
		
		Sons s=new Sons();
		s.setSid(11);
		Sons s1=(Sons)ss.selectOne("com.weikun.dao.SonsMapper.selectByPrimaryKey", s);
		
		System.out.print(s1.getSname());
		
		System.out.print(s1.getFather().getFname());
		
		ss.close();
		
		
		return null;
	}

}
