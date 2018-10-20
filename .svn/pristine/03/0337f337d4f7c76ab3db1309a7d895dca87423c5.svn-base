package com.xykj.crowdfunding.service;

import java.util.List;

import com.xykj.crowdfunding.reverse.pojo.Systemdictionary;


public interface SystemdictionaryService {
	/**
	 * 根据名称获取字典
	 * @param dic_name
	 * @return
	 */
	List<Systemdictionary> getDicByName(String dic_name);
	/**
	 * 根据字典编码获取字典
	 * @param dic_code
	 * @return
	 */
	List<Systemdictionary> getDicByCode(String dic_code);
	/**
	 * 根据字典id获取字典
	 * @param dic_id
	 * @return
	 */
	List<Systemdictionary> getDicById(Integer dic_id);
	/**
	 * 校验字典编码是否存在
	 * @param dicId
	 * @return
	 */
	boolean isDicCodeExist(String dic_code);
	/**
	 * 校验字典名称是否存在
	 * @param dic_name
	 * @return
	 */
	boolean isDicNameExist(String dic_name);
	/**
	 * 校验字典排序是否存在
	 * @param dic_ord
	 * @return
	 */
	boolean isDicOrdExist(Integer dic_ord);
	
	boolean addSysDic(Systemdictionary sysdic);
}
