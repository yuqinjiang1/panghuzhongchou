package com.xykj.crowdfunding.utils;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @TODO 邮件发送工具类
 * @author 林山
 * @Date 2018年9月19日 上午9:41:31
 */
public class JavaMailUtil {
	private static Logger logger = LogManager.getLogger(JavaMailUtil.class);
	private static Properties prop;

	static {
		// 初始化
		prop = new Properties();
		// 加载外部属性文件
		InputStream is = JavaMailUtil.class.getClassLoader()
				.getResourceAsStream("source/email-config.properties");
		try {
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("邮件资料加载异常....");
		}
	}

	/**
	 * 邮件发送
	 * 
	 * @param sendTo
	 *            邮件接收者数组
	 * @param title
	 *            邮件主题
	 * @param info
	 *            邮件内容
	 */
	public static void sendEmail(String[] sendTo, String title, String info) {
		// 创建连接邮箱对象
		Session session = Session.getInstance(prop);
		// 获取邮件发送对象（邮差）
		Transport transport = null;
		try {
			// 构建邮件
			Message message = new MimeMessage(session);
			// 设置邮件发送者
			message.setFrom(new InternetAddress(prop.getProperty("email.user")));
			InternetAddress[] list = new InternetAddress[sendTo.length];
			for(int i=0;i<list.length;i++){
					list[i] = new InternetAddress(sendTo[i]);
			}
			
			// 设置邮件接收者
			message.setRecipients(RecipientType.TO, list);
			// 设置邮件主题
			message.setSubject(title);
			
			// 设置邮件内容   发送普通文本
			//message.setText(info);
			//如果邮件内容包含图片或者其他内容（超链接）
			message.setContent(info, "text/html;charset=utf-8");
			transport = session.getTransport();
			// 连接QQ邮箱（登录QQ邮箱） 传入账号密码
			transport.connect(prop.getProperty("email.user"), prop.getProperty("email.password"));
			// 发送邮件
			transport.sendMessage(message, message.getAllRecipients());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("邮件发送失败！"+e);
		}finally{
			try {
				if(transport!=null){
					// 关闭邮差
					transport.close();
				}
			} catch (MessagingException e) {
				e.printStackTrace();
			}
		}

	}
}
