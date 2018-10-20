package com.xykj.ssm.test;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class TestJedis {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		
		jedis.set("name", "李四");
		 System.out.println("======>: "+jedis.get("name"));
	}
	@Test
	public void test1()
	{
		JedisPool jp = new JedisPool("127.0.0.1", 6379);
		Jedis jd = jp.getResource();
		String nameString = jd.get("name");
		System.out.println("nameString: "+nameString);
	}

}
