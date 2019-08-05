package com.qy.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.qy.model.FileDetail;
import com.qy.service.FileService;
import com.qy.util.CommUtils;
import com.qy.util.DateUtils;

@RestController
public class FileController {

	
	private static String SYSTEM_NAME = "/test";
	@Autowired
	FileService fileService;
	
	@Autowired
	JdbcTemplate jdbc;
	
	private final static Logger log = (Logger) LoggerFactory.getLogger(FileController.class);

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFile(@RequestParam("file") MultipartFile file) {
		log.info("size="+file.getSize());
		
		String newFileName =  CommUtils.getUUID();
		String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."),file.getOriginalFilename().length());
		
		FileDetail fd = new FileDetail(CommUtils.getUUID(), 
				file.getOriginalFilename(), newFileName+suffix, file.getContentType(), DateUtils.currentTime(),
				"Harry", "Harry", "human", file.getSize()+"M", SYSTEM_NAME, "", "", "44020787",
				"44020787", 1100, 2180);
		
		System.out.println(fd.toString());
		jdbc.queryForList("select * from qy_image_detail ");
		
		fileService.uploadFile(SYSTEM_NAME,newFileName+suffix,file,fd);
		
		return "successful";
	} 
	
	
	@RequestMapping(value = "/getFilesInfo", method = RequestMethod.POST)
	@ResponseBody
	public List<FileDetail> getFilesInfo() {
		
		return fileService.getFilesInfo();
	} 
}

