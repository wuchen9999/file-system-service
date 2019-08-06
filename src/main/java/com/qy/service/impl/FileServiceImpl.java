package com.qy.service.impl;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.qy.controller.FileController;
import com.qy.dao.FileDetailMapper;
import com.qy.model.FileDetail;
import com.qy.service.FileService;
import com.qy.util.FileUtils;

@Service
public class FileServiceImpl implements FileService {
	
	private final static Logger log = (Logger) LoggerFactory.getLogger(FileController.class);

	@Autowired
	FileDetailMapper  mapper;

	
	/**
	 * @author YQ
	 * @description 上传文件成功后，将文件信息塞入数据库
	 * @param storePath 文件存储到文件服务器的名称
	 * @param filename 文件上传的到文件服务器的文件名称
	 * @param file 上传的文件
	 * @param fileDetail 文件的具体属性
	 */
	@Override
	public void uploadFile(String storePath, String filename, MultipartFile file,FileDetail fileDetail) {
		// TODO Auto-generated method stub
		try {
			if(FileUtils.uploadFile(storePath, filename, file.getInputStream())) {
				
				mapper.insert(fileDetail);
				log.info("文件："+file.getOriginalFilename()+"上传成功！");
			}else {
				new RuntimeException("文件："+file.getOriginalFilename()+"上传失败！请联系管理员！！！");
			}
		} catch (IOException e) {
			e.printStackTrace();
			new RuntimeException("文件："+file.getOriginalFilename()+"上传失败！失败原因："+e.getMessage());
		}
	}

	@Override
	public List<FileDetail> getFilesInfo() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
