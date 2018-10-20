package com.xykj.crowdfunding.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xykj.crowdfunding.reverse.dao.SystemdictionaryMapper;
import com.xykj.crowdfunding.reverse.dao.SystemdictionaryitemMapper;
import com.xykj.crowdfunding.reverse.pojo.Systemdictionary;
import com.xykj.crowdfunding.reverse.pojo.SystemdictionaryExample;
import com.xykj.crowdfunding.reverse.pojo.SystemdictionaryExample.Criteria;
import com.xykj.crowdfunding.reverse.pojo.Systemdictionaryitem;
import com.xykj.crowdfunding.reverse.pojo.SystemdictionaryitemExample;
import com.xykj.crowdfunding.service.SystemdictionaryService;

@Service
public class SystemdictionaryServiceImpl implements SystemdictionaryService {

	@Autowired
	private SystemdictionaryMapper dMapper;
	
	 
	@Override
	public List<Systemdictionary> getDicByName(String dic_name) {
		SystemdictionaryExample example = new SystemdictionaryExample();
		//创建过滤条件
		
		if (dic_name!=null&&!dic_name.equals("")) {
			Criteria criteria = example.createCriteria().andDicNameEqualTo(dic_name);
			
		}
		List<Systemdictionary> list = dMapper.selectByExample(example);
		return list;
	}
	@Override
	public List<Systemdictionary> getDicByCode(String dic_code) {
		SystemdictionaryExample example = new SystemdictionaryExample();
		//创建过滤条件
		Criteria criteria = null;
		if (dic_code!=null&&!dic_code.equals("")) {
			 criteria = example.createCriteria().andDicNameEqualTo(dic_code);
		}
		criteria.andDicCodeIsNotNull();
		List<Systemdictionary> list = dMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<Systemdictionary> getDicById(Integer dic_id) {
		SystemdictionaryExample example = new SystemdictionaryExample();
		//创建过滤条件
		
		if (dic_id!=null) {
			Criteria criteria = example.createCriteria().andDicIdEqualTo(dic_id);
		}
		System.out.println("dic_id: "+dic_id);
		List<Systemdictionary> list = dMapper.selectByExample(example);
		System.out.println("Systemdictionary list: "+list);
		return list;
	}
	
	@Override
	public boolean isDicCodeExist(String dic_code) {
		List<Systemdictionary> list  = getDicByCode(dic_code);
		if (list!=null&&list.size()>0) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isDicNameExist(String dic_name) {
		SystemdictionaryExample example = new SystemdictionaryExample();
		//创建过滤条件
		Criteria criteria = null;
		if (dic_name!=null&&!dic_name.equals("")) {
			 criteria = example.createCriteria().andDicNameEqualTo(dic_name);
		}
		criteria.andDicNameIsNotNull();
		List<Systemdictionary> list = dMapper.selectByExample(example);
		if (list!=null&&list.size()>0) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isDicOrdExist(Integer dic_ord) {
		SystemdictionaryExample example = new SystemdictionaryExample();
		//创建过滤条件
		Criteria criteria = null;
		if (dic_ord!=null) {
			 criteria = example.createCriteria().andDicIdEqualTo(dic_ord);
		}
		criteria.andDicOrdIsNotNull();
		List<Systemdictionary> list = dMapper.selectByExample(example);
		if (list!=null&&list.size()>0) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean addSysDic(Systemdictionary sysdic) {
		int i = dMapper.insert(sysdic);
		if (i>0) {
			return true;
		}
		return false;
	}
}
