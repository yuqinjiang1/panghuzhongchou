package com.xykj.crowdfunding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xykj.crowdfunding.reverse.dao.SystemdictionaryitemMapper;
import com.xykj.crowdfunding.reverse.pojo.Systemdictionaryitem;
import com.xykj.crowdfunding.reverse.pojo.SystemdictionaryitemExample;
import com.xykj.crowdfunding.reverse.pojo.SystemdictionaryitemExample.Criteria;
import com.xykj.crowdfunding.service.SystemdictionaryitemService;

@Service
public class SystemdictionaryitemServiceImpl implements
		SystemdictionaryitemService {

	@Autowired
	private SystemdictionaryitemMapper iMapper;

	@Override
	public List<Systemdictionaryitem> getItemsById(Integer dic_id) {
		SystemdictionaryitemExample example = new SystemdictionaryitemExample();
		//创建过滤条件
		
		if (dic_id!=null) {
			Criteria criteria = example.createCriteria().andDicIdEqualTo(dic_id);
			System.out.println("创造过滤条件");
		}
		List<Systemdictionaryitem> list= iMapper.selectByExample(example);
		
		return list;
	}
	
	@Override
	public Systemdictionaryitem getItemByItemId(Integer itemId) {
		if (itemId==null) {
			return null;
		}
		Systemdictionaryitem item= iMapper.selectByPrimaryKey(itemId);
		return item;
	}
	
	@Override
	public boolean delItemByItemId(Integer itemId) {
		if (itemId==null) {
			return false;
		}
		int i= iMapper.deleteByPrimaryKey(itemId);
		if (i > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateItem(Systemdictionaryitem item) {
		//名称，值和排序都不能跟 数据库其它数据一致
		SystemdictionaryitemExample example = new SystemdictionaryitemExample();
		//创建过滤条件
		Criteria criteria = null;
		if (item!=null) {
			/*criteria = example.createCriteria().andDicIdEqualTo(dic_id);
			System.out.println("创造过滤条件");*/
		}
		
		return false;
	}
}
