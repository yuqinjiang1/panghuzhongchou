package com.xykj.crowdfunding.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P2pDateUtils {
	/**
	 *   日期转换成字符串 
	 * 
	 * @param date
	 *             
	 * @return str 
	 */
	public static String DateToStr(Date date,String formatStr) {

		SimpleDateFormat format = new SimpleDateFormat(formatStr);
		String str = format.format(date);
		return str;
	}
	/**
	 * 字符串转日期
	 * @param str
	 * @param formatStr
	 * @return
	 */
	public static Date StrToDate(String str,String formatStr) {
		SimpleDateFormat format = new SimpleDateFormat(formatStr);
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;

	}
	/**
	 * 计算两个时间的小时差
	 * @param oldDate
	 * @param newDate
	 * @return
	 */
	public static long hoursBetweenTwoDate(Date oldDate,Date newDate)
	{
		System.out.println("oldDate: "+oldDate);
		System.out.println("newDate: "+newDate);
		long time = newDate.getTime()-oldDate.getTime();
		long hours = time/1000/60/60;
		System.out.println("hours: "+hours);
		return hours;
	}
	/**
	 * 计算到期时间
	 * @param oldDate
	 * @param month
	 * @return
	 */
	public static Date getExpireTimeWith(Date oldDate,int month)
	{
		String sdfString = "yyyy-MM-dd HH:mm:ss";
		Date newDate = P2pDateUtils.StrToDate(P2pDateUtils.DateToStr(oldDate,sdfString),sdfString);
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(newDate);
		rightNow.add(Calendar.MONTH,month);//日期加3个月
		return rightNow.getTime();
	}
}
