package data.dao.mapper;

import data.dao.pojo.Nscdcm;
import data.dao.pojo.exp.NscdcmExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface NscdcmMapper {
    int countByExample(NscdcmExample example);

    int deleteByExample(NscdcmExample example);

    int deleteByPrimaryKey(String code);

    int insert(Nscdcm record);

    int insertSelective(Nscdcm record);

    List<Nscdcm> selectByExample(NscdcmExample example);

    Nscdcm selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") Nscdcm record, @Param("example") NscdcmExample example);

    int updateByExample(@Param("record") Nscdcm record, @Param("example") NscdcmExample example);

    int updateByPrimaryKeySelective(Nscdcm record);

    int updateByPrimaryKey(Nscdcm record);
}