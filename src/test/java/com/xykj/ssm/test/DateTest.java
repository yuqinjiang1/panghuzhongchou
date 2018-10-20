package com.xykj.ssm.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.xykj.crowdfunding.utils.P2pDateUtils;

public class DateTest {

	@Test
	public void test()
	{
		Date date = new Date();
		System.out.println("日期转字符串：" + P2pDateUtils.DateToStr(date,"yyyy-MM-dd"));
		System.out.println("字符串转日期：" + P2pDateUtils.StrToDate(P2pDateUtils.DateToStr(date,"yyyy-MM-dd"),"yyyy-MM-dd"));
	}

	@Test
	public void testDate()
	{
		Date olddate = P2pDateUtils.StrToDate("2018-10-5 17:53:00", "yyyy-MM-dd HH:mm:ss");
		Date newDate = P2pDateUtils.StrToDate(P2pDateUtils.DateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"),"yyyy-MM-dd HH:mm:ss");
		
		System.out.println("oldDate: "+olddate);
		System.out.println("newDate: "+newDate);
		long time = newDate.getTime()- olddate.getTime();
		long result = time/1000/60/60;
		System.out.println("result: "+result);
	}
	

	@Test
	public void testDate3()
	{
		Date olddate = P2pDateUtils.StrToDate("2018-10-5 17:53:00", "yyyy-MM-dd HH:mm:ss");
		Date newDate = P2pDateUtils.StrToDate(P2pDateUtils.DateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"),"yyyy-MM-dd HH:mm:ss");
		
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(newDate);
		rightNow.add(Calendar.MONTH,2);//日期加3个月
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date dt1=rightNow.getTime();
        String reStr = sdf.format(dt1);
        System.out.println("最终时间： "+reStr);

	}
	
	@Test
	public void testDate4()
	{
		Date reuslt = P2pDateUtils.getExpireTimeWith(new Date(), 3);
		System.out.println("date: "+reuslt);
	}
}
