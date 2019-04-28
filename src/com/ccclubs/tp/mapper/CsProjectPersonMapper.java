package com.ccclubs.tp.mapper;

import com.ccclubs.tp.model.CsProjectPerson;
import com.ccclubs.tp.model.CsProjectPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsProjectPersonMapper {
    int countByExample(CsProjectPersonExample example);

    int deleteByExample(CsProjectPersonExample example);

    int deleteByPrimaryKey(Long csppId);

    int insert(CsProjectPerson record);

    int insertSelective(CsProjectPerson record);

    List<CsProjectPerson> selectByExample(CsProjectPersonExample example);

    CsProjectPerson selectByPrimaryKey(Long csppId);

    int updateByExampleSelective(@Param("record") CsProjectPerson record, @Param("example") CsProjectPersonExample example);

    int updateByExample(@Param("record") CsProjectPerson record, @Param("example") CsProjectPersonExample example);

    int updateByPrimaryKeySelective(CsProjectPerson record);

    int updateByPrimaryKey(CsProjectPerson record);
}