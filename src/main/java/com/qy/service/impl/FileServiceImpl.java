package com.qy.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.qy.dao.FileDetailMapper;
import com.qy.model.FileDetail;
import com.qy.service.FileService;
import com.qy.util.FileUtils;

@Service
public class FileServiceImpl implements FileService {
	
	@Autowired
	FileDetailMapper  mapper;

	@Override
	public void uploadFile(String storePath, String filename, MultipartFile file,FileDetail fd) {
		// TODO Auto-generated method stub
		try {
			if(FileUtils.uploadFile(storePath, filename, file.getInputStream())) {
				System.out.println("上传成功！");
				mapper.insert(fd);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<FileDetail> getFilesInfo() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
