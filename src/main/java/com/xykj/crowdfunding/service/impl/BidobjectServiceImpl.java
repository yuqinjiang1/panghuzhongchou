package com.xykj.crowdfunding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xykj.crowdfunding.reverse.dao.BidobjectMapper;
import com.xykj.crowdfunding.reverse.pojo.Bidobject;
import com.xykj.crowdfunding.reverse.pojo.BidobjectExample;
import com.xykj.crowdfunding.reverse.pojo.BidobjectExample.Criteria;
import com.xykj.crowdfunding.service.BidobjectService;
import com.xykj.crowdfunding.utils.P2pDateUtils;

@Service
public class BidobjectServiceImpl implements BidobjectService {
	
	@Autowired
	private BidobjectMapper bidobjectMapper;

	@Override
	public boolean addBid(Bidobject bidobject) {
		
		int i = bidobjectMapper.insert(bidobject);
		System.out.println("投标结果 i===》: "+i+"  getBidId()"+bidobject.getBidId());
		if (i > 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public List<Bidobject> getBidobjectsByLoanId(Integer loanId) {
		if (loanId==null) {
			return null;
		}
		BidobjectExample example = new BidobjectExample();
		//创建过滤条件
		Criteria criteria = example.createCriteria().andLoanIdEqualTo(loanId);
		//设置分页
		
		List<Bidobject> list= bidobjectMapper.selectByExample(example);
		if (list!=null&&list.size()>0) {
			for(Bidobject ob:list)
			{
				if (ob.getBidTime()!=null) {
					ob.setBidTimeString(P2pDateUtils.DateToStr(ob.getBidTime(), "yyyy-MM-dd"));
				}
				
			}
		}
		return list;
	}

}
