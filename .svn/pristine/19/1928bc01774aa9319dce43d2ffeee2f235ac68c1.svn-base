package com.xykj.crowdfunding.utils;

import java.util.List;

/**
 * EasyuiResult.java
 * @author 林山
 * @Date 2018年9月19日下午3:56:23
 */
public class EasyUIResult<T> {
	private int total;
	private List<T> rows;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	/**
	 * 
	 */
	public EasyUIResult() {
		super();
	}
	/**
	 * @param total
	 * @param rows
	 */
	public EasyUIResult(int total, List<T> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	/**
	 * @param total
	 * @param rows
	 */
	public EasyUIResult(Long total, List<T> rows) {
		super();
		this.total = total.intValue();
		this.rows = rows;
	}
	
	
	
}
