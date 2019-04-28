package com.ccclubs.tp.mapper;

import com.ccclubs.tp.model.CsProjectInfo;
import com.ccclubs.tp.model.CsProjectInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsProjectInfoMapper {
    int countByExample(CsProjectInfoExample example);

    int deleteByExample(CsProjectInfoExample example);

    int deleteByPrimaryKey(Long cspiId);

    int insert(CsProjectInfo record);

    int insertSelective(CsProjectInfo record);

    List<CsProjectInfo> selectByExample(CsProjectInfoExample example);

    CsProjectInfo selectByPrimaryKey(Long cspiId);

    int updateByExampleSelective(@Param("record") CsProjectInfo record, @Param("example") CsProjectInfoExample example);

    int updateByExample(@Param("record") CsProjectInfo record, @Param("example") CsProjectInfoExample example);

    int updateByPrimaryKeySelective(CsProjectInfo record);

    int updateByPrimaryKey(CsProjectInfo record);
}