package com.xykj.crowdfunding.reverse.pojo;

import java.util.Map;

public class MenuChildrenTree {
	private String text;
	private Map<String, String> attributes;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Map<String, String> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
	@Override
	public String toString() {
		return "MenuChildrenTree [text=" + text + ", attributes=" + attributes
				+ "]";
	}
	
	

}
