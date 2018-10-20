package com.xykj.crowdfunding.reverse.dao;

import com.xykj.crowdfunding.reverse.pojo.Bidobject;
import com.xykj.crowdfunding.reverse.pojo.BidobjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BidobjectMapper {
    int countByExample(BidobjectExample example);

    int deleteByExample(BidobjectExample example);

    int deleteByPrimaryKey(Integer bidId);

    int insert(Bidobject record);

    int insertSelective(Bidobject record);

    List<Bidobject> selectByExample(BidobjectExample example);

    Bidobject selectByPrimaryKey(Integer bidId);

    int updateByExampleSelective(@Param("record") Bidobject record, @Param("example") BidobjectExample example);

    int updateByExample(@Param("record") Bidobject record, @Param("example") BidobjectExample example);

    int updateByPrimaryKeySelective(Bidobject record);

    int updateByPrimaryKey(Bidobject record);
}