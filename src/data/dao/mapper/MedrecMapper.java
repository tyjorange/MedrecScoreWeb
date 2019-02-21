package data.dao.mapper;

import data.dao.pojo.Medrec;
import data.dao.pojo.exp.MedrecExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MedrecMapper {
    int countByExample(MedrecExample example);

    int deleteByExample(MedrecExample example);

    int insert(Medrec record);

    int insertSelective(Medrec record);

    List<Medrec> selectByExample(MedrecExample example);

    int updateByExampleSelective(@Param("record") Medrec record, @Param("example") MedrecExample example);

    int updateByExample(@Param("record") Medrec record, @Param("example") MedrecExample example);
}