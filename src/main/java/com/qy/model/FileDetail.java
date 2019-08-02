package com.qy.model;

import java.io.Serializable;

public class FileDetail implements Serializable {
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

    private String fileUploadUserid;

    private Integer fileHeight;

    private Integer fileWidth;

    private static final long serialVersionUID = 1L;
    
    

    public FileDetail(String id, String fileOrginalName, String fileName, String fileCodeType, String fileUploadTime,
			String fileUploadUsername, String author, String fileDescription, String fileSize, String orginalFilePath,
			String compressFilePath, String fileType, String authorId, String fileUploadUserid, Integer fileHeight,
			Integer fileWidth) {
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
		this.fileUploadUserid = fileUploadUserid;
		this.fileHeight = fileHeight;
		this.fileWidth = fileWidth;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFileOrginalName() {
        return fileOrginalName;
    }

    public void setFileOrginalName(String fileOrginalName) {
        this.fileOrginalName = fileOrginalName == null ? null : fileOrginalName.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileCodeType() {
        return fileCodeType;
    }

    public void setFileCodeType(String fileCodeType) {
        this.fileCodeType = fileCodeType == null ? null : fileCodeType.trim();
    }

    public String getFileUploadTime() {
        return fileUploadTime;
    }

    public void setFileUploadTime(String fileUploadTime) {
        this.fileUploadTime = fileUploadTime == null ? null : fileUploadTime.trim();
    }

    public String getFileUploadUsername() {
        return fileUploadUsername;
    }

    public void setFileUploadUsername(String fileUploadUsername) {
        this.fileUploadUsername = fileUploadUsername == null ? null : fileUploadUsername.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription == null ? null : fileDescription.trim();
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize == null ? null : fileSize.trim();
    }

    public String getOrginalFilePath() {
        return orginalFilePath;
    }

    public void setOrginalFilePath(String orginalFilePath) {
        this.orginalFilePath = orginalFilePath == null ? null : orginalFilePath.trim();
    }

    public String getCompressFilePath() {
        return compressFilePath;
    }

    public void setCompressFilePath(String compressFilePath) {
        this.compressFilePath = compressFilePath == null ? null : compressFilePath.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public String getFileUploadUserid() {
        return fileUploadUserid;
    }

    public void setFileUploadUserid(String fileUploadUserid) {
        this.fileUploadUserid = fileUploadUserid == null ? null : fileUploadUserid.trim();
    }

    public Integer getFileHeight() {
        return fileHeight;
    }

    public void setFileHeight(Integer fileHeight) {
        this.fileHeight = fileHeight;
    }

    public Integer getFileWidth() {
        return fileWidth;
    }

    public void setFileWidth(Integer fileWidth) {
        this.fileWidth = fileWidth;
    }
}