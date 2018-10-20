package com.xykj.crowdfunding.reverse.dao;

import com.xykj.crowdfunding.reverse.pojo.Loanform;
import com.xykj.crowdfunding.reverse.pojo.LoanformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanformMapper {
    int countByExample(LoanformExample example);

    int deleteByExample(LoanformExample example);

    int deleteByPrimaryKey(Integer loanId);

    int insert(Loanform record);

    int insertSelective(Loanform record);

    List<Loanform> selectByExample(LoanformExample example);

    Loanform selectByPrimaryKey(Integer loanId);

    int updateByExampleSelective(@Param("record") Loanform record, @Param("example") LoanformExample example);

    int updateByExample(@Param("record") Loanform record, @Param("example") LoanformExample example);

    int updateByPrimaryKeySelective(Loanform record);

    int updateByPrimaryKey(Loanform record);
}