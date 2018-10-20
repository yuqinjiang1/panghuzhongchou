package com.xykj.ssm.test;


import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

import com.xykj.crowdfunding.utils.JavaMailUtil;


public class JavaMailTest {
	public static void main(String[] args) throws MessagingException {
		Properties properties = new Properties();
		//设置邮件发送协议  一般都是smtp
		properties.put("mail.transport.protocol", "smtp");
		//设置邮箱服务器地址(域名或者ip地址)
		properties.put("mail.smtp.host", "smtp.qq.com");
		//设置邮箱服务器端口号
		properties.put("mail.smtp.port", 465);
		//设置是否需要账户验证
		properties.put("mail.smtp.auth", "true");
		//设置邮箱是否需要ssl安全传输
		properties.put("mail.smtp.ssl.enable", "true");
		//是否需要打印日志
		properties.put("mail.debug", "true");
		//创建连接邮箱的对象
		Session session = Session.getInstance(properties);
		//构建邮件
		Message message = new MimeMessage(session);
		//设置邮件发送者
		message.setFrom(new InternetAddress("1409181750@qq.com"));
		//设置邮件接收者
		message.setRecipients(
				RecipientType.TO,
				new InternetAddress[] { new InternetAddress("1409181750@qq.com") });
		//设置校验码
		String validateCode = new Date().getTime()+"";
		//设置邮件主题
		message.setSubject("������֤�ʼ�");
/*		 StringBuffer sf=new StringBuffer();
	        sf.append("<a href=\"http://www.baidu.com/**?email=");
	        sf.append("1409181750@qq.com");
	        sf.append("&validateCode=");
	        sf.append(validateCode);
	        sf.append("\">");
	        sf.append(" <FONT   face=\"MS   UI   Gothic\"   size=\"3\"><b>�������</b></FONT>");
	        sf.append("</a>");
	        sf.append("�����˺ţ�24Сʱ��Ч������������֤���뾡�켤�<br>");
		*/
		//设置邮件内容
	    message.setText("嘿嘿嘿嘿嘿<br/>");
	  //  message.setContent("��������"+sf,"text/html;charset=utf-8");
		//获取邮件发送对象（邮差）
	    Transport transport = session.getTransport();
		//连接qq邮箱（登录qq邮箱）传入账号密码
	    transport.connect("310750801@qq.com", "zbzkygvcxrnxbgfj");// ����Ϊ�ղŵõ�����Ȩ��
		//发送邮件
	    transport.sendMessage(message, message.getAllRecipients());
		//关闭邮差
	    transport.close();
	}
	
	@Test
	public void test1(){
		JavaMailUtil.sendEmail(new String[]{"1409181750@qq.com"}, "测试", "<a href=\"http://www.baidu.com\">百度一下</a>");
	}

}
