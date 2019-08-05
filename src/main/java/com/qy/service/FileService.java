package com.qy.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.qy.model.FileDetail;


public interface FileService {

	void uploadFile(String storePath, String fileName, MultipartFile file, FileDetail fd);

	List<FileDetail> getFilesInfo();


}
