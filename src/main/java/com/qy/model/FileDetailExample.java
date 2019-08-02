package com.qy.model;

import java.util.ArrayList;
import java.util.List;

public class FileDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameIsNull() {
            addCriterion("FILE_ORGINAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameIsNotNull() {
            addCriterion("FILE_ORGINAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameEqualTo(String value) {
            addCriterion("FILE_ORGINAL_NAME =", value, "fileOrginalName");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameNotEqualTo(String value) {
            addCriterion("FILE_ORGINAL_NAME <>", value, "fileOrginalName");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameGreaterThan(String value) {
            addCriterion("FILE_ORGINAL_NAME >", value, "fileOrginalName");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_ORGINAL_NAME >=", value, "fileOrginalName");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameLessThan(String value) {
            addCriterion("FILE_ORGINAL_NAME <", value, "fileOrginalName");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_ORGINAL_NAME <=", value, "fileOrginalName");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameLike(String value) {
            addCriterion("FILE_ORGINAL_NAME like", value, "fileOrginalName");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameNotLike(String value) {
            addCriterion("FILE_ORGINAL_NAME not like", value, "fileOrginalName");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameIn(List<String> values) {
            addCriterion("FILE_ORGINAL_NAME in", values, "fileOrginalName");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameNotIn(List<String> values) {
            addCriterion("FILE_ORGINAL_NAME not in", values, "fileOrginalName");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameBetween(String value1, String value2) {
            addCriterion("FILE_ORGINAL_NAME between", value1, value2, "fileOrginalName");
            return (Criteria) this;
        }

        public Criteria andFileOrginalNameNotBetween(String value1, String value2) {
            addCriterion("FILE_ORGINAL_NAME not between", value1, value2, "fileOrginalName");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeIsNull() {
            addCriterion("FILE_CODE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeIsNotNull() {
            addCriterion("FILE_CODE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeEqualTo(String value) {
            addCriterion("FILE_CODE_TYPE =", value, "fileCodeType");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeNotEqualTo(String value) {
            addCriterion("FILE_CODE_TYPE <>", value, "fileCodeType");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeGreaterThan(String value) {
            addCriterion("FILE_CODE_TYPE >", value, "fileCodeType");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_CODE_TYPE >=", value, "fileCodeType");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeLessThan(String value) {
            addCriterion("FILE_CODE_TYPE <", value, "fileCodeType");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeLessThanOrEqualTo(String value) {
            addCriterion("FILE_CODE_TYPE <=", value, "fileCodeType");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeLike(String value) {
            addCriterion("FILE_CODE_TYPE like", value, "fileCodeType");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeNotLike(String value) {
            addCriterion("FILE_CODE_TYPE not like", value, "fileCodeType");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeIn(List<String> values) {
            addCriterion("FILE_CODE_TYPE in", values, "fileCodeType");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeNotIn(List<String> values) {
            addCriterion("FILE_CODE_TYPE not in", values, "fileCodeType");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeBetween(String value1, String value2) {
            addCriterion("FILE_CODE_TYPE between", value1, value2, "fileCodeType");
            return (Criteria) this;
        }

        public Criteria andFileCodeTypeNotBetween(String value1, String value2) {
            addCriterion("FILE_CODE_TYPE not between", value1, value2, "fileCodeType");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeIsNull() {
            addCriterion("FILE_UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeIsNotNull() {
            addCriterion("FILE_UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeEqualTo(String value) {
            addCriterion("FILE_UPLOAD_TIME =", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeNotEqualTo(String value) {
            addCriterion("FILE_UPLOAD_TIME <>", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeGreaterThan(String value) {
            addCriterion("FILE_UPLOAD_TIME >", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_UPLOAD_TIME >=", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeLessThan(String value) {
            addCriterion("FILE_UPLOAD_TIME <", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeLessThanOrEqualTo(String value) {
            addCriterion("FILE_UPLOAD_TIME <=", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeLike(String value) {
            addCriterion("FILE_UPLOAD_TIME like", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeNotLike(String value) {
            addCriterion("FILE_UPLOAD_TIME not like", value, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeIn(List<String> values) {
            addCriterion("FILE_UPLOAD_TIME in", values, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeNotIn(List<String> values) {
            addCriterion("FILE_UPLOAD_TIME not in", values, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeBetween(String value1, String value2) {
            addCriterion("FILE_UPLOAD_TIME between", value1, value2, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadTimeNotBetween(String value1, String value2) {
            addCriterion("FILE_UPLOAD_TIME not between", value1, value2, "fileUploadTime");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameIsNull() {
            addCriterion("FILE_UPLOAD_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameIsNotNull() {
            addCriterion("FILE_UPLOAD_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameEqualTo(String value) {
            addCriterion("FILE_UPLOAD_USERNAME =", value, "fileUploadUsername");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameNotEqualTo(String value) {
            addCriterion("FILE_UPLOAD_USERNAME <>", value, "fileUploadUsername");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameGreaterThan(String value) {
            addCriterion("FILE_UPLOAD_USERNAME >", value, "fileUploadUsername");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_UPLOAD_USERNAME >=", value, "fileUploadUsername");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameLessThan(String value) {
            addCriterion("FILE_UPLOAD_USERNAME <", value, "fileUploadUsername");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameLessThanOrEqualTo(String value) {
            addCriterion("FILE_UPLOAD_USERNAME <=", value, "fileUploadUsername");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameLike(String value) {
            addCriterion("FILE_UPLOAD_USERNAME like", value, "fileUploadUsername");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameNotLike(String value) {
            addCriterion("FILE_UPLOAD_USERNAME not like", value, "fileUploadUsername");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameIn(List<String> values) {
            addCriterion("FILE_UPLOAD_USERNAME in", values, "fileUploadUsername");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameNotIn(List<String> values) {
            addCriterion("FILE_UPLOAD_USERNAME not in", values, "fileUploadUsername");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameBetween(String value1, String value2) {
            addCriterion("FILE_UPLOAD_USERNAME between", value1, value2, "fileUploadUsername");
            return (Criteria) this;
        }

        public Criteria andFileUploadUsernameNotBetween(String value1, String value2) {
            addCriterion("FILE_UPLOAD_USERNAME not between", value1, value2, "fileUploadUsername");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("AUTHOR =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("AUTHOR <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("AUTHOR >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("AUTHOR <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("AUTHOR like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("AUTHOR not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("AUTHOR in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("AUTHOR not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("AUTHOR between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("AUTHOR not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionIsNull() {
            addCriterion("FILE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionIsNotNull() {
            addCriterion("FILE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionEqualTo(String value) {
            addCriterion("FILE_DESCRIPTION =", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionNotEqualTo(String value) {
            addCriterion("FILE_DESCRIPTION <>", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionGreaterThan(String value) {
            addCriterion("FILE_DESCRIPTION >", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_DESCRIPTION >=", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionLessThan(String value) {
            addCriterion("FILE_DESCRIPTION <", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionLessThanOrEqualTo(String value) {
            addCriterion("FILE_DESCRIPTION <=", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionLike(String value) {
            addCriterion("FILE_DESCRIPTION like", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionNotLike(String value) {
            addCriterion("FILE_DESCRIPTION not like", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionIn(List<String> values) {
            addCriterion("FILE_DESCRIPTION in", values, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionNotIn(List<String> values) {
            addCriterion("FILE_DESCRIPTION not in", values, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionBetween(String value1, String value2) {
            addCriterion("FILE_DESCRIPTION between", value1, value2, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionNotBetween(String value1, String value2) {
            addCriterion("FILE_DESCRIPTION not between", value1, value2, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("FILE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("FILE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(String value) {
            addCriterion("FILE_SIZE =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(String value) {
            addCriterion("FILE_SIZE <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(String value) {
            addCriterion("FILE_SIZE >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_SIZE >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(String value) {
            addCriterion("FILE_SIZE <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(String value) {
            addCriterion("FILE_SIZE <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLike(String value) {
            addCriterion("FILE_SIZE like", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotLike(String value) {
            addCriterion("FILE_SIZE not like", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<String> values) {
            addCriterion("FILE_SIZE in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<String> values) {
            addCriterion("FILE_SIZE not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(String value1, String value2) {
            addCriterion("FILE_SIZE between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(String value1, String value2) {
            addCriterion("FILE_SIZE not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathIsNull() {
            addCriterion("ORGINAL_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathIsNotNull() {
            addCriterion("ORGINAL_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathEqualTo(String value) {
            addCriterion("ORGINAL_FILE_PATH =", value, "orginalFilePath");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathNotEqualTo(String value) {
            addCriterion("ORGINAL_FILE_PATH <>", value, "orginalFilePath");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathGreaterThan(String value) {
            addCriterion("ORGINAL_FILE_PATH >", value, "orginalFilePath");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("ORGINAL_FILE_PATH >=", value, "orginalFilePath");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathLessThan(String value) {
            addCriterion("ORGINAL_FILE_PATH <", value, "orginalFilePath");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathLessThanOrEqualTo(String value) {
            addCriterion("ORGINAL_FILE_PATH <=", value, "orginalFilePath");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathLike(String value) {
            addCriterion("ORGINAL_FILE_PATH like", value, "orginalFilePath");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathNotLike(String value) {
            addCriterion("ORGINAL_FILE_PATH not like", value, "orginalFilePath");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathIn(List<String> values) {
            addCriterion("ORGINAL_FILE_PATH in", values, "orginalFilePath");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathNotIn(List<String> values) {
            addCriterion("ORGINAL_FILE_PATH not in", values, "orginalFilePath");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathBetween(String value1, String value2) {
            addCriterion("ORGINAL_FILE_PATH between", value1, value2, "orginalFilePath");
            return (Criteria) this;
        }

        public Criteria andOrginalFilePathNotBetween(String value1, String value2) {
            addCriterion("ORGINAL_FILE_PATH not between", value1, value2, "orginalFilePath");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathIsNull() {
            addCriterion("COMPRESS_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathIsNotNull() {
            addCriterion("COMPRESS_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathEqualTo(String value) {
            addCriterion("COMPRESS_FILE_PATH =", value, "compressFilePath");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathNotEqualTo(String value) {
            addCriterion("COMPRESS_FILE_PATH <>", value, "compressFilePath");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathGreaterThan(String value) {
            addCriterion("COMPRESS_FILE_PATH >", value, "compressFilePath");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("COMPRESS_FILE_PATH >=", value, "compressFilePath");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathLessThan(String value) {
            addCriterion("COMPRESS_FILE_PATH <", value, "compressFilePath");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathLessThanOrEqualTo(String value) {
            addCriterion("COMPRESS_FILE_PATH <=", value, "compressFilePath");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathLike(String value) {
            addCriterion("COMPRESS_FILE_PATH like", value, "compressFilePath");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathNotLike(String value) {
            addCriterion("COMPRESS_FILE_PATH not like", value, "compressFilePath");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathIn(List<String> values) {
            addCriterion("COMPRESS_FILE_PATH in", values, "compressFilePath");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathNotIn(List<String> values) {
            addCriterion("COMPRESS_FILE_PATH not in", values, "compressFilePath");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathBetween(String value1, String value2) {
            addCriterion("COMPRESS_FILE_PATH between", value1, value2, "compressFilePath");
            return (Criteria) this;
        }

        public Criteria andCompressFilePathNotBetween(String value1, String value2) {
            addCriterion("COMPRESS_FILE_PATH not between", value1, value2, "compressFilePath");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("FILE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("FILE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("FILE_TYPE =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("FILE_TYPE <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("FILE_TYPE >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_TYPE >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("FILE_TYPE <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("FILE_TYPE <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("FILE_TYPE like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("FILE_TYPE not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("FILE_TYPE in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("FILE_TYPE not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("FILE_TYPE between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("FILE_TYPE not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("AUTHOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("AUTHOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(String value) {
            addCriterion("AUTHOR_ID =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(String value) {
            addCriterion("AUTHOR_ID <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(String value) {
            addCriterion("AUTHOR_ID >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR_ID >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(String value) {
            addCriterion("AUTHOR_ID <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR_ID <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLike(String value) {
            addCriterion("AUTHOR_ID like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotLike(String value) {
            addCriterion("AUTHOR_ID not like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<String> values) {
            addCriterion("AUTHOR_ID in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<String> values) {
            addCriterion("AUTHOR_ID not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(String value1, String value2) {
            addCriterion("AUTHOR_ID between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(String value1, String value2) {
            addCriterion("AUTHOR_ID not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridIsNull() {
            addCriterion("FILE_UPLOAD_USERID is null");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridIsNotNull() {
            addCriterion("FILE_UPLOAD_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridEqualTo(String value) {
            addCriterion("FILE_UPLOAD_USERID =", value, "fileUploadUserid");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridNotEqualTo(String value) {
            addCriterion("FILE_UPLOAD_USERID <>", value, "fileUploadUserid");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridGreaterThan(String value) {
            addCriterion("FILE_UPLOAD_USERID >", value, "fileUploadUserid");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_UPLOAD_USERID >=", value, "fileUploadUserid");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridLessThan(String value) {
            addCriterion("FILE_UPLOAD_USERID <", value, "fileUploadUserid");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridLessThanOrEqualTo(String value) {
            addCriterion("FILE_UPLOAD_USERID <=", value, "fileUploadUserid");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridLike(String value) {
            addCriterion("FILE_UPLOAD_USERID like", value, "fileUploadUserid");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridNotLike(String value) {
            addCriterion("FILE_UPLOAD_USERID not like", value, "fileUploadUserid");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridIn(List<String> values) {
            addCriterion("FILE_UPLOAD_USERID in", values, "fileUploadUserid");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridNotIn(List<String> values) {
            addCriterion("FILE_UPLOAD_USERID not in", values, "fileUploadUserid");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridBetween(String value1, String value2) {
            addCriterion("FILE_UPLOAD_USERID between", value1, value2, "fileUploadUserid");
            return (Criteria) this;
        }

        public Criteria andFileUploadUseridNotBetween(String value1, String value2) {
            addCriterion("FILE_UPLOAD_USERID not between", value1, value2, "fileUploadUserid");
            return (Criteria) this;
        }

        public Criteria andFileHeightIsNull() {
            addCriterion("FILE_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andFileHeightIsNotNull() {
            addCriterion("FILE_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andFileHeightEqualTo(Integer value) {
            addCriterion("FILE_HEIGHT =", value, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightNotEqualTo(Integer value) {
            addCriterion("FILE_HEIGHT <>", value, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightGreaterThan(Integer value) {
            addCriterion("FILE_HEIGHT >", value, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("FILE_HEIGHT >=", value, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightLessThan(Integer value) {
            addCriterion("FILE_HEIGHT <", value, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightLessThanOrEqualTo(Integer value) {
            addCriterion("FILE_HEIGHT <=", value, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightIn(List<Integer> values) {
            addCriterion("FILE_HEIGHT in", values, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightNotIn(List<Integer> values) {
            addCriterion("FILE_HEIGHT not in", values, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightBetween(Integer value1, Integer value2) {
            addCriterion("FILE_HEIGHT between", value1, value2, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("FILE_HEIGHT not between", value1, value2, "fileHeight");
            return (Criteria) this;
        }

        public Criteria andFileWidthIsNull() {
            addCriterion("FILE_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andFileWidthIsNotNull() {
            addCriterion("FILE_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andFileWidthEqualTo(Integer value) {
            addCriterion("FILE_WIDTH =", value, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthNotEqualTo(Integer value) {
            addCriterion("FILE_WIDTH <>", value, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthGreaterThan(Integer value) {
            addCriterion("FILE_WIDTH >", value, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("FILE_WIDTH >=", value, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthLessThan(Integer value) {
            addCriterion("FILE_WIDTH <", value, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthLessThanOrEqualTo(Integer value) {
            addCriterion("FILE_WIDTH <=", value, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthIn(List<Integer> values) {
            addCriterion("FILE_WIDTH in", values, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthNotIn(List<Integer> values) {
            addCriterion("FILE_WIDTH not in", values, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthBetween(Integer value1, Integer value2) {
            addCriterion("FILE_WIDTH between", value1, value2, "fileWidth");
            return (Criteria) this;
        }

        public Criteria andFileWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("FILE_WIDTH not between", value1, value2, "fileWidth");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}