package com.qy.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
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

@CrossOrigin
@RestController
public class FileController {

	
	private static String SYSTEM_NAME = "test";
	private static BigDecimal CONVERSION_VALUE = new BigDecimal(1048576);
	@Autowired
	FileService fileService;
	
	@Autowired
	JdbcTemplate jdbc;
	
	private final static Logger log = (Logger) LoggerFactory.getLogger(FileController.class);

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFile(@RequestParam("file") MultipartFile file) {
		System.out.println(System.currentTimeMillis());
		log.info("startTime:"+new SimpleDateFormat("YYYY-MM-DD hh-mm-ss").format(new Date()));
		if(!file.isEmpty()) {
			BigDecimal fileSize =  new BigDecimal(file.getSize());
			String newFileName =  CommUtils.getUUID();
			String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."),file.getOriginalFilename().length());
			
			FileDetail fileDetail = new FileDetail(CommUtils.getUUID(), 
					file.getOriginalFilename(), newFileName+suffix, file.getContentType(), DateUtils.currentTime(),
					"Harry", "Harry", "human", fileSize.divide(CONVERSION_VALUE, 3, RoundingMode.HALF_UP)+"M", SYSTEM_NAME, "", "", "44020787",
					"44020787", 1100, 2180);
			
			fileService.uploadFile(SYSTEM_NAME,newFileName+suffix,file,fileDetail);
			
			log.info("endTime:"+new SimpleDateFormat("YYYY-MM-DD hh-mm-ss").format(new Date()));
		}else {
			return "file cannot be empty !!";
		}
		System.out.println(System.currentTimeMillis());

		return "successful";
	} 
	
	
	@RequestMapping(value = "/getFilesInfo", method = RequestMethod.POST)
	@ResponseBody
	public List<FileDetail> getFilesInfo() {
		
		return fileService.getFilesInfo();
	} 
}

