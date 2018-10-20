package com.xykj.crowdfunding.reverse.dao;

import com.xykj.crowdfunding.reverse.pojo.Systemdictionary;
import com.xykj.crowdfunding.reverse.pojo.SystemdictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemdictionaryMapper {
    int countByExample(SystemdictionaryExample example);

    int deleteByExample(SystemdictionaryExample example);

    int deleteByPrimaryKey(Integer dicId);

    int insert(Systemdictionary record);

    int insertSelective(Systemdictionary record);

    List<Systemdictionary> selectByExample(SystemdictionaryExample example);

    Systemdictionary selectByPrimaryKey(Integer dicId);

    int updateByExampleSelective(@Param("record") Systemdictionary record, @Param("example") SystemdictionaryExample example);

    int updateByExample(@Param("record") Systemdictionary record, @Param("example") SystemdictionaryExample example);

    int updateByPrimaryKeySelective(Systemdictionary record);

    int updateByPrimaryKey(Systemdictionary record);
}