package com.qy.dao;

import com.qy.model.FileDetail;
import com.qy.model.FileDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileDetailMapper {
    int countByExample(FileDetailExample example);

    int deleteByExample(FileDetailExample example);

    int insert(FileDetail record);

    int insertSelective(FileDetail record);

    List<FileDetail> selectByExample(FileDetailExample example);

    int updateByExampleSelective(@Param("record") FileDetail record, @Param("example") FileDetailExample example);

    int updateByExample(@Param("record") FileDetail record, @Param("example") FileDetailExample example);
}