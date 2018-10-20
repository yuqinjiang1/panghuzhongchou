package com.xykj.crowdfunding.reverse.pojo;

import java.util.List;

public class Systemdictionary {
    private Integer dicId;

    private String dicCode;

    private String dicName;

    private Integer dicStatus;

    private Integer dicOrd;
    
    private List<Systemdictionaryitem> items;

    public void setItems(List<Systemdictionaryitem> items) {
		this.items = items;
	}
    
    public List<Systemdictionaryitem> getItems() {
		return items;
	}
    public Integer getDicId() {
        return dicId;
    }

    public void setDicId(Integer dicId) {
        this.dicId = dicId;
    }

    public String getDicCode() {
        return dicCode;
    }

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode == null ? null : dicCode.trim();
    }

    public String getDicName() {
        return dicName;
    }

    public void setDicName(String dicName) {
        this.dicName = dicName == null ? null : dicName.trim();
    }

    public Integer getDicStatus() {
        return dicStatus;
    }

    public void setDicStatus(Integer dicStatus) {
        this.dicStatus = dicStatus;
    }

    public Integer getDicOrd() {
        return dicOrd;
    }

    public void setDicOrd(Integer dicOrd) {
        this.dicOrd = dicOrd;
    }
}