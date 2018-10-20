package com.xykj.crowdfunding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xykj.crowdfunding.reverse.pojo.Systemdictionary;
import com.xykj.crowdfunding.reverse.pojo.Systemdictionaryitem;
import com.xykj.crowdfunding.service.SystemdictionaryitemService;
import com.xykj.crowdfunding.utils.P2PResult;

@Controller
@RequestMapping("/sysdic")
public class SystemdictionaryitemController {
	@Autowired
	private SystemdictionaryitemService iService;
	
	/**
	 * 根据明细id查询明细
	 * @param sdic
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getItemByItemId")
	public Systemdictionaryitem getItemByItemId(@RequestParam("itemId")Integer itemId)
	{
		Systemdictionaryitem item = iService.getItemByItemId(itemId);
		System.out.println("item: "+item);
		if (item!=null) {
			//return P2PResult.build(1, "操作成功", item);
		}else {
			//return P2PResult.build(0, "操作失败");
		}
		return item;
	}

	/**
	 * 根据明细id删除明细
	 * @param sdic
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delItemByItemId")
	public P2PResult delItemByItemId(@RequestParam("itemId")Integer itemId)
	{
		boolean flag = iService.delItemByItemId(itemId);
		System.out.println("flag: "+flag);
		if (flag) {
			return P2PResult.build(1, "操作成功");
		}else {
			return P2PResult.build(0, "操作失败");
		}
	}
}
