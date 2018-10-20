package com.xykj.crowdfunding.reverse.dao;

import com.xykj.crowdfunding.reverse.pojo.Systemdictionaryitem;
import com.xykj.crowdfunding.reverse.pojo.SystemdictionaryitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemdictionaryitemMapper {
    int countByExample(SystemdictionaryitemExample example);

    int deleteByExample(SystemdictionaryitemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(Systemdictionaryitem record);

    int insertSelective(Systemdictionaryitem record);

    List<Systemdictionaryitem> selectByExample(SystemdictionaryitemExample example);

    Systemdictionaryitem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") Systemdictionaryitem record, @Param("example") SystemdictionaryitemExample example);

    int updateByExample(@Param("record") Systemdictionaryitem record, @Param("example") SystemdictionaryitemExample example);

    int updateByPrimaryKeySelective(Systemdictionaryitem record);

    int updateByPrimaryKey(Systemdictionaryitem record);
}