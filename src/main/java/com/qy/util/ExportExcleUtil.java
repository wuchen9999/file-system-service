package com.qy.util;

import java.util.ArrayList;
import java.util.List;

import com.qy.model.FileDetail;

public class ExportExcleUtil {

	public static void main(String[] args) {
		FileDetail fd = new FileDetail();
		List<FileDetail> data = new ArrayList<FileDetail>();
		data.add(fd);
		String []  head = {"kiak","ssss"};
		exportToExcle("sss.xls", data, head);
	}
	
	/**
	 * @param exportFileName 导出文件的名称
	 * @param data 导出的数据List<Object>
	 * @param head 导出标题的设置
	 */
	public static  void exportToExcle(String exportFileName, List<?> data,String[] head) {
		for (Object fd : data) {
			fd.getClass().getDeclaredFields();
		}
	}
}
