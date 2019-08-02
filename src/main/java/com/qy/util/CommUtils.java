package com.qy.util;


import java.util.UUID;


public class CommUtils {
	// 处理成功
	public final static String SUCC = "0";
	// 处理失败
	public final static String ERROR = "1";
	// 数据存在
	public final static String EXIT = "2";
	// 启用/禁用成员。1表示启用成员，0表示禁用成员
	public final static int enable = 1;
	/**
	 * 获得UUID
	 * @return
	 */
	public static String getUUID(){		
		return UUID.randomUUID().toString().toUpperCase().replace("-", "");
	}
	
	public static String getUUIDlow(){		
		return UUID.randomUUID().toString().replace("-", "");
	}
	
}