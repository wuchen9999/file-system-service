package com.qy;

import java.io.Serializable;

public class FileDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -343461337263426954L;
	
	private String id;
	private String fileOrginalName;
	private String fileName;
	private String fileCodeType;
	private String fileUploadTime;
	private String fileUploadUsername;
	private String author;
	private String fileDescription;
	private String fileSize;
	private String orginalFilePath;
	private String compressFilePath;
	private String fileType;
	private String authorId;
	private String fileUploadUserId;
	private int fileHeight;
	private int fileWidth;
	
	
	
	
	public FileDetail() {
		super();
	}




	
	
	
	public FileDetail(String id, String fileOrginalName, String fileName, String fileCodeType, String fileUploadTime,
			String fileUploadUsername, String author, String fileDescription, String fileSize, String orginalFilePath,
			String compressFilePath, String fileType, String authorId, String fileUploadUserId, int fileHeight,
			int fileWidth) {
		super();
		this.id = id;
		this.fileOrginalName = fileOrginalName;
		this.fileName = fileName;
		this.fileCodeType = fileCodeType;
		this.fileUploadTime = fileUploadTime;
		this.fileUploadUsername = fileUploadUsername;
		this.author = author;
		this.fileDescription = fileDescription;
		this.fileSize = fileSize;
		this.orginalFilePath = orginalFilePath;
		this.compressFilePath = compressFilePath;
		this.fileType = fileType;
		this.authorId = authorId;
		this.fileUploadUserId = fileUploadUserId;
		this.fileHeight = fileHeight;
		this.fileWidth = fileWidth;
	}







	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFileOrginalName() {
		return fileOrginalName;
	}
	public void setFileOrginalName(String fileOrginalName) {
		this.fileOrginalName = fileOrginalName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileCodeType() {
		return fileCodeType;
	}
	public void setFileCodeType(String fileCodeType) {
		this.fileCodeType = fileCodeType;
	}
	public String getFileUploadTime() {
		return fileUploadTime;
	}
	public void setFileUploadTime(String fileUploadTime) {
		this.fileUploadTime = fileUploadTime;
	}
	public String getFileUploadUsername() {
		return fileUploadUsername;
	}
	public void setFileUploadUsername(String fileUploadUsername) {
		this.fileUploadUsername = fileUploadUsername;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getFileDescription() {
		return fileDescription;
	}
	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getOrginalFilePath() {
		return orginalFilePath;
	}
	public void setOrginalFilePath(String orginalFilePath) {
		this.orginalFilePath = orginalFilePath;
	}
	public String getCompressFilePath() {
		return compressFilePath;
	}
	public void setCompressFilePath(String compressFilePath) {
		this.compressFilePath = compressFilePath;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public String getFileUploadUserId() {
		return fileUploadUserId;
	}
	public void setFileUploadUserId(String fileUploadUserId) {
		this.fileUploadUserId = fileUploadUserId;
	}



	public int getFileHeight() {
		return fileHeight;
	}



	public void setFileHeight(int fileHeight) {
		this.fileHeight = fileHeight;
	}



	public int getFileWidth() {
		return fileWidth;
	}



	public void setFileWidth(int fileWidth) {
		this.fileWidth = fileWidth;
	}

	
	

}
