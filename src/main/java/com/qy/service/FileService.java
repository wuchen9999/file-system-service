package com.qy.service;

import org.springframework.web.multipart.MultipartFile;

import com.qy.model.FileDetail;


public interface FileService {

	void uploadFile(String storePath, String fileName, MultipartFile file, FileDetail fd);


}
