package com.xykj.crowdfunding.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
 
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
 
 
public class SendMsgUtil {
	public static  HashMap<String,String> getMessageStatus(String phone) throws HttpException, IOException{
		HashMap<String,String> m = new HashMap<String,String>();
		//http协议
		HttpClient client = new HttpClient();
		//连接第三方平台
		PostMethod post = new PostMethod("http://gbk.api.smschinese.cn/");
		post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");//在头文件中设置转码  
 
 
		//生成六位验证码
		String charValue = "";
		for (int i = 0; i < 6; i++) {
		char c = (char) (randomInt(0, 9) + '0');
		charValue += String.valueOf(c);
		}
		//短信模板
		NameValuePair[] data ={ 
		new NameValuePair("Uid", "这里是注册的时候的用户名"),  //sms短信通 注册的用户名
		new NameValuePair("Key", "这里是注册的时候密匙"), //密匙
		new NameValuePair("smsMob",phone),//要发送的手机号
		new NameValuePair("smsText","验证码:"+charValue+"，发送")//短信内容
		};  
 
		post.setRequestBody(data); 
		client.executeMethod(post);
		//获取http头
		Header[] headers = post.getResponseHeaders();  
		int statusCode = post.getStatusCode();  
 
		System.out.println("statusCode:"+statusCode);  
 
		for(Header h:headers){
		System.out.println(h.toString());	
		}
		//获取返回消息
		String result = new String(post.getResponseBodyAsString().getBytes("gbk"));   
		System.out.println(result); //打印返回消息状态  
		//将返回消息和6位数验证码放入到m列表里面
		m.put("result", result);  
		m.put("code", charValue);
		//断开与第三方平台的连接
		post.releaseConnection();  
 
		return m;
 
		}
		//生成验证码
		public static  int randomInt(int from, int to) {
		Random r = new Random();
		return from + r.nextInt(to - from);
		}
}