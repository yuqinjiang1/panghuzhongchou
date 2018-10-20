package com.xykj.crowdfunding.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class UploadController {
	
	/** 
	 * 一次上传多张图片 
	 * @throws IOException 
	 */  
	@RequestMapping("/multiFileUpload")  
	@ResponseBody
	public List<String> threeFileUpload(  
	        @RequestParam(value="goods_img",required=false) CommonsMultipartFile files[],  
	        HttpServletRequest request,HttpServletResponse response, Map<String, Object>map) throws IOException {  
		System.out.println("进去了上传方法");
	    List<String> list = new ArrayList<String>();  
	    // 获得项目的路径  
	    ServletContext sc = request.getSession().getServletContext();  
	    // 上传位置  
	    String path = sc.getRealPath("/img") + "/"; // 设定文件保存的目录  
	    File f = new File(path);  
	    //System.out.println("f前======>"+f);
	    //创建文件夹
	    if (!f.exists())  
	        f.mkdirs();  
	  //System.out.println("f后======>"+f.mkdirs());
	    for (int i = 0; i < files.length; i++) {  
	        // 获得原始文件名  
	        String fileName = files[i].getOriginalFilename();  
	        if(fileName==null | fileName== ""){
	        	System.out.println("请上传图片....");
	        	response.getWriter().write("	×");
	        	//return "${pageContext.request.contextPath}/backstage/realname_authentication";
	        }else{
	        	
	        
	        System.out.println("原始文件名:" + fileName);  
	        // 新文件名  
	        String newFileName = UUID.randomUUID() + fileName;  
	        if (!files[i].isEmpty()) {  
	            try {  
	                FileOutputStream fos = new FileOutputStream(path  
	                        + newFileName);  
	                InputStream in = files[i].getInputStream();  
	                int b = 0;  
	                while ((b = in.read()) != -1) {  
	                    fos.write(b);  
	                }  
	                fos.close();  
	                in.close();  
	            } catch (Exception e) {  
	                e.printStackTrace();  
	            }  
	        }  
	        
	        String pathUrlString = path + newFileName;
	        System.out.println("上传图片到:" + pathUrlString);  
	        list.add(pathUrlString);  
	  
	    }  
	    // 保存文件地址，用于JSP页面回显  ;
	    map.put("fileList", list);
	    //System.out.println("list=====>"+list);
	    }
	    
	    return list;  
	  
	}  
	
	@RequestMapping("/testSub")
	public String testStr(HttpServletRequest request){
		System.out.println("==========");
		return "success";
	}
	
}
