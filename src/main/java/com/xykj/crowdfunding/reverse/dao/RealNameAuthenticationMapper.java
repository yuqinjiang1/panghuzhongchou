package com.xykj.crowdfunding.reverse.dao;

import com.xykj.crowdfunding.reverse.pojo.RealNameAuthentication;
import com.xykj.crowdfunding.reverse.pojo.RealNameAuthenticationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RealNameAuthenticationMapper {
    int countByExample(RealNameAuthenticationExample example);

    int deleteByExample(RealNameAuthenticationExample example);

    int deleteByPrimaryKey(Integer realNameAuthenticationId);

    int insert(RealNameAuthentication record);

    int insertSelective(RealNameAuthentication record);

    List<RealNameAuthentication> selectByExample(RealNameAuthenticationExample example);

    RealNameAuthentication selectByPrimaryKey(Integer realNameAuthenticationId);

    int updateByExampleSelective(@Param("record") RealNameAuthentication record, @Param("example") RealNameAuthenticationExample example);

    int updateByExample(@Param("record") RealNameAuthentication record, @Param("example") RealNameAuthenticationExample example);

    int updateByPrimaryKeySelective(RealNameAuthentication record);

    int updateByPrimaryKey(RealNameAuthentication record);
}