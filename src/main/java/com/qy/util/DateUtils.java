package com.qy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String currentTime() {
		return new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date());
	}
}
