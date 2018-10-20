package com.xykj.crowdfunding.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class FileUploadController {
	
	@RequestMapping("/imgupload")
	public String fileUpload(HttpServletRequest request, @RequestParam("goods_img")MultipartFile file,Map<String, Object>map) throws IOException{
		System.out.println("文件大小:"+file.getSize()+"字节");
		System.out.println("文件上传的表单的name属性值: "+file.getName());
		System.out.println("文件名称： "+file.getOriginalFilename());
		System.out.println("上传时间为： "+new Date().getTime());
		String filename = new Date().getTime()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		
		System.out.println("生成的图片名字是： "+filename);
		String filepath = "D:\\apache-tomcat-7.0.90-windows-x64\\apache-tomcat-7.0.90\\webapps\\jiang_crowd_funding\\files\\"+filename;
		//D:/java-code/ssm/jiang_crowd_funding/src/main/webapp/files/
		//D:\\apache-tomcat-7.0.90-windows-x64\\apache-tomcat-7.0.90\\webapps\\jiang_crowd_funding\\files\\
		System.out.println("存储路径： "+filepath);
		File f = new File(filepath);
		
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(file.getBytes());
		fos.flush();
		fos.close();
		 InetAddress address = InetAddress.getLocalHost();
		 //获取的是本地的IP地址 //PC-20140317PXKX/192.168.0.121
		String hostAddress = address.getHostAddress();
		System.out.println("hostAddress: "+hostAddress);
		
/*		System.out.println("address.getHostName(): "+address.getHostName());
		System.out.println("request.getContextPath(): "+request.getContextPath());
		String imgpath =hostAddress+":"+request.getLocalPort()+request.getContextPath()+"/files/"+filename;
		System.out.println("imgpath: " +imgpath);*/
		map.put("imagepath", "files/"+filename);
		return "success";
	}
	

}
