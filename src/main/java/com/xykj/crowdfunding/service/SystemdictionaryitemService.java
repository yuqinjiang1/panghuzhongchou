package com.xykj.crowdfunding.service;

import java.util.List;

import com.xykj.crowdfunding.reverse.pojo.Systemdictionaryitem;


public interface SystemdictionaryitemService {
	/**
	 * 根据分类的dic_id 获取字典明细
	 * @param dic_id
	 * @return
	 */
	List<Systemdictionaryitem> getItemsById(Integer dic_id);
	/**
	 * 根据明细id获取明细
	 * @param itemId
	 * @return
	 */
	Systemdictionaryitem getItemByItemId(Integer itemId);
	/**
	 * 根据明细id删除明细
	 * @param itemId
	 * @return
	 */
	boolean delItemByItemId(Integer itemId);
	
	/**
	 * 修改字典明细
	 * @param item
	 * @return
	 */
	boolean updateItem(Systemdictionaryitem item);
	

}
