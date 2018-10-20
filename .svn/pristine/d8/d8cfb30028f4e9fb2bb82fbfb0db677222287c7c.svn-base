package com.xykj.crowdfunding.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xykj.crowdfunding.reverse.pojo.Systemdictionary;
import com.xykj.crowdfunding.reverse.pojo.Systemdictionaryitem;
import com.xykj.crowdfunding.service.SystemdictionaryService;
import com.xykj.crowdfunding.service.SystemdictionaryitemService;
import com.xykj.crowdfunding.utils.P2PResult;

@Controller
public class SystemdictionaryController {

	@Autowired
	private SystemdictionaryService dService;
	@Autowired
	private SystemdictionaryitemService iService;
	/**
	 * 根据 id获取 字典明细
	 * @param dicId
	 * @param map
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getItemsById")
	public List<Systemdictionaryitem> getItemsById(@RequestParam(value="dicid",required=false) Integer dicId,Map<String,Object>map){
		System.out.println("dicId++++"+dicId);
		
		List<Systemdictionary> sysdics= dService.getDicById(dicId);
		System.out.println("sysdics: "+sysdics);
		List<Systemdictionaryitem> itemList = new ArrayList<Systemdictionaryitem>();
		

		for(Systemdictionary sds:sysdics)
		 {
			List<Systemdictionaryitem> subiliList = iService.getItemsById(sds.getDicId());
			for(Systemdictionaryitem ib: subiliList){
				ib.setDicName(sds.getDicName());
				//System.out.println("ib: "+ib.getDicId()+"===>"+ib.getDicName()+"===>"+ib.getItemName());
			}
			itemList.addAll(subiliList);
		}
			
	
		
		for(Systemdictionaryitem ib: itemList){
			System.out.println("ib: "+ib.getDicId()+"===>"+ib.getDicName()+"===>"+ib.getItemName());
		}
		map.put("list", itemList);
		return itemList;
	}
	
	/**
	 * 根据id获取数据字典和明细
	 * @param dicid
	 * @param map
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getDicAndItemsById")
	public List<Systemdictionary> getDicAndItemByDicId(@RequestParam(value="dicid",required=false) Integer dicid,Map<String,Object>map){
		
		List<Systemdictionary> list = dService.getDicById(dicid);
		System.out.println("list: "+list+"size : "+list.size());
		
		for(Systemdictionary sb:list)
		{
			System.out.println("dic_id: "+sb.getDicId());
			List<Systemdictionaryitem> subiliList = iService.getItemsById(sb.getDicId());
			for(Systemdictionaryitem ib: subiliList){
				ib.setDicName(sb.getDicName());
				System.out.println("ib: "+ib.getDicId()+"===>"+ib.getDicName()+"===>"+ib.getItemName());
			}
			/*sb.setItems(subiliList);*/
			sb.setItems(subiliList);
			
		}
		

		map.put("list", list);
		return list;
	}
	
	/**
	 * 根据名称获取明细
	 * @param dic_name
	 * @param map
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getItems")
	public List<Systemdictionaryitem> getItems(@RequestParam(value="dic_name",required=false) String dic_name,Map<String,Object>map){
		List<Systemdictionary> list = dService.getDicByName(dic_name);
		System.out.println("list: "+list+"size : "+list.size());
		List<Systemdictionaryitem> itemList = new ArrayList<Systemdictionaryitem>();
		
		for(Systemdictionary sb:list)
		{
			System.out.println("dic_id: "+sb.getDicId());
			List<Systemdictionaryitem> subiliList = iService.getItemsById(sb.getDicId());
			for(Systemdictionaryitem ib: subiliList){
				ib.setDicName(sb.getDicName());
				//System.out.println("ib: "+ib.getDicId()+"===>"+ib.getDicName()+"===>"+ib.getItemName());
			}
			itemList.addAll(subiliList);
			
		}
		
		for(Systemdictionaryitem ib: itemList){
			System.out.println("ib: "+ib.getDicId()+"===>"+ib.getDicName()+"===>"+ib.getItemName());
		}
		map.put("list", itemList);
		return itemList;
	}
	

	
	@ResponseBody
	@RequestMapping("/getDicAndItems")
	public List<Systemdictionary> getDicAndItemByDicName(@RequestParam(value="dic_name",required=false) String dic_name,Map<String,Object>map){
		List<Systemdictionary> list = dService.getDicByName(dic_name);
		System.out.println("list: "+list+"size : "+list.size());
		
		for(Systemdictionary sb:list)
		{
			System.out.println("dic_id: "+sb.getDicId());
			List<Systemdictionaryitem> subiliList = iService.getItemsById(sb.getDicId());
			for(Systemdictionaryitem ib: subiliList){
				ib.setDicName(sb.getDicName());
				System.out.println("ib: "+ib.getDicId()+"===>"+ib.getDicName()+"===>"+ib.getItemName());
			}
			sb.setItems(subiliList);
			
		}
		

		map.put("list", list);
		return list;
	}
	
	/**
	 * 添加字典分类
	 * @param sdic
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addSysDataDic")
	public P2PResult addSysDataDic(Systemdictionary sdic)
	{
		//Systemdictionary sdic
		boolean flagCode = dService.isDicCodeExist(sdic.getDicCode());
		boolean flagName = dService.isDicNameExist(sdic.getDicName());
		boolean flagOrde = dService.isDicOrdExist(sdic.getDicOrd());
		
		if (!flagCode&&!flagName&&!flagOrde) {
			System.out.println("字典数据正确");
			boolean successFlag = dService.addSysDic(sdic);
			if (successFlag) {
				return P2PResult.ok();
			}
		}else {
			System.out.println("数据字典已存在");
		}
		return P2PResult.build(0, "添加失败");
	}


}
