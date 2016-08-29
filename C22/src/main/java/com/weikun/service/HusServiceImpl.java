package com.weikun.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.weikun.model.Hus;
import com.weikun.model.HusExample;
import com.weikun.model.HusExample.Criteria;
import com.weikun.model.Wife;

public class HusServiceImpl implements IHusService {
	private SqlSessionFactory ssf=null;
	private SqlSession ss=null;
	public HusServiceImpl(){
		
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
		new HusServiceImpl().selectForPro();
	}

	@Override
	public int deleteByPrimaryKey(Integer hid) {
		// TODO Auto-generated method stub
		ss=ssf.openSession();
		
		
		Wife wife=new Wife();
		wife.setHid(20);
		
		
		ss.delete("com.weikun.dao.WifeMapper.deleteByPrimaryKey", wife);
		
		Hus hus=new Hus();
		hus.setHid(20);
		
		
		ss.delete("com.weikun.dao.HusMapper.deleteByPrimaryKey", hus);
		
		ss.commit();
		ss.close();
		return 0;
	}

	@Override
	public int insert(Hus record) {
		// TODO Auto-generated method stub
		ss=ssf.openSession();
		Hus hus=new Hus();
		hus.setHid(20);
		hus.setHname("JACK");
		
		ss.insert("com.weikun.dao.HusMapper.insert", hus);
		
		
		Wife wife=new Wife();
		wife.setHid(20);
		wife.setWname("ROSE");
		
		ss.insert("com.weikun.dao.WifeMapper.insert", wife);
		System.out.print("success");
		ss.commit();
		ss.close();
		
		
		return 0;
	}

	@Override
	public List<Hus> selectByExample(HusExample example) {
		// TODO Auto-generated method stub
		ss=ssf.openSession();		
		HusExample e=new HusExample();
		
		e.createCriteria().andHnameLike("j%");
		
		List<Hus>  list=ss.selectList("com.weikun.dao.HusMapper.selectByExample", e);
		
		for(Hus h :list){
			
			System.out.println(h.getHname());
			
		}
//		
		
		ss.close();
		return null;
	}

	@Override
	public Hus selectByPrimaryKey(Integer hid) {
		// TODO Auto-generated method stub
		
		ss=ssf.openSession();
		
		Hus hus=ss.selectOne("com.weikun.dao.HusMapper.selectByPrimaryKey", 19);
		System.out.print(hus.getHname());		
		System.out.print(hus.getWife().getWname());
		
		ss.close();
		
		
		return null;
	}

	@Override
	public int updateByPrimaryKey(Hus record) {
		// TODO Auto-generated method stub
		ss=ssf.openSession();
		Hus hus=new Hus();
		hus.setHid(19);
		hus.setHname("java");
		
		ss.update("com.weikun.dao.HusMapper.updateByPrimaryKey", hus);
		
		
		Wife wife=new Wife();
		wife.setHid(19);
		wife.setWname("C++");
		
		ss.insert("com.weikun.dao.WifeMapper.updateByPrimaryKey", wife);
		System.out.print("success");
		ss.commit();
		ss.close();
		return 0;
	}
	@Override
	public List<Hus> selectAll() {
		// TODO Auto-generated method stub
		
		ss=ssf.openSession();
		
		List<Hus> list=ss.selectList("com.weikun.dao.HusMapper.selectAll");
		
		for(Hus h :list){
			System.out.print(h.getHname());
		}
		
		ss.close();
		return null;
	}
	@Override
	public void selectForPro() {
		// TODO Auto-generated method stub
		ss=ssf.openSession();
		Map<String,String> map=new HashMap<String,String>();
		map.put("in_id", "19");
		
		ss.selectOne("com.weikun.dao.HusMapper.selectForPro",map);
		
		System.out.print(map.get("out_name"));
		
		ss.close();
	}

}
