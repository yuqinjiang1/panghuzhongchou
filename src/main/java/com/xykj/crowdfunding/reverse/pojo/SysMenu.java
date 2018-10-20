package com.xykj.crowdfunding.reverse.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysMenu {
    private Integer menuId;

    private Integer parentid;

    private String menuName;

    private String menuUrl;

    private String menuIcon;

    private String menuInfo;

    private Integer sort;

    private Boolean isShow;

    private Integer powerId;
    
    private String parentMenuName;
    private List<SysMenu> subMenus;

    public Integer getMenuId() {
        return menuId;
    }
    
    public String getParentMenuName() {
		return parentMenuName;
	}
    
    public List<SysMenu> getSubMenus() {
		return subMenus;
	}
    public void setSubMenus(List<SysMenu> subMenus) {
		this.subMenus = subMenus;
	}
    
    public void setParentMenuName(String parentMenuName) {
		this.parentMenuName = parentMenuName;
	}

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getParentid() {
        return parentid;
    }
    public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public String getMenuInfo() {
        return menuInfo;
    }

    public void setMenuInfo(String menuInfo) {
        this.menuInfo = menuInfo == null ? null : menuInfo.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

	@Override
	public String toString() {
		return "SysMenu [menuId=" + menuId + ", parentid=" + parentid
				+ ", menuName=" + menuName + ", menuUrl=" + menuUrl
				+ ", menuIcon=" + menuIcon + ", menuInfo=" + menuInfo
				+ ", sort=" + sort + ", isShow=" + isShow + ", powerId="
				+ powerId + ", parentMenuName=" + parentMenuName
				+ ", subMenus=" + subMenus + "]";
	}

/*	public static List<TreeNode > ConvertTreeNode(List<SysMenu> listMenus)        
	{            List<TreeNode> listTreeNodes = new ArrayList<TreeNode>();            
				LoadTreeNode(listMenus, listTreeNodes, 0);            
				return listTreeNodes;        
	}        
	private static void LoadTreeNode(List<SysMenu > listMenus,
			List<TreeNode > listTreeNodes,int Pid)        
	{          
		for (SysMenu menu: listMenus )            
		{                
			if (menu.parentid.equals(String.valueOf(Pid)))                
		{                    
				TreeNode node = menu.TransformTreeNode();                    
				listTreeNodes.Add(node);                    
				LoadTreeNode(listMenus, node.children, node.id);                
			}            
		}        
	}


	private TreeNode TransformTreeNode()        
	{            
		TreeNode treeNode = new TreeNode();
		treeNode.id = this.menuId.intValue();
		treeNode.text = this.menuName;
		//treeNode.state = this.State == true ? "open" : "closed",
		treeNode.Checked = false;
		//treeNode.attributes = new { Url = "#" };
					//children = new List<TreeNode>()        
		           
		return treeNode;        
	}
*/

}