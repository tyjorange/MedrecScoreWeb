package data.dao.mapper;

import data.dao.pojo.Nscd;
import data.dao.pojo.exp.NscdExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface NscdMapper {
    int countByExample(NscdExample example);

    int deleteByExample(NscdExample example);

    int deleteByPrimaryKey(String code);

    int insert(Nscd record);

    int insertSelective(Nscd record);

    List<Nscd> selectByExample(NscdExample example);

    Nscd selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") Nscd record, @Param("example") NscdExample example);

    int updateByExample(@Param("record") Nscd record, @Param("example") NscdExample example);

    int updateByPrimaryKeySelective(Nscd record);

    int updateByPrimaryKey(Nscd record);
}