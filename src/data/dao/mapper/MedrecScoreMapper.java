package data.dao.mapper;

import data.dao.pojo.MedrecScore;
import data.dao.pojo.exp.MedrecScoreExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MedrecScoreMapper {
	int countByExample(MedrecScoreExample example);

	int deleteByExample(MedrecScoreExample example);

	int deleteByPrimaryKey(String id);

	int insert(MedrecScore record);

	int insertBatch(List<MedrecScore> medrecScoreList);

	int insertSelective(MedrecScore record);

	List<MedrecScore> selectByExample(MedrecScoreExample example);

	MedrecScore selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") MedrecScore record, @Param("example") MedrecScoreExample example);

	int updateByExample(@Param("record") MedrecScore record, @Param("example") MedrecScoreExample example);

	int updateByPrimaryKeySelective(MedrecScore record);

	int updateByPrimaryKey(MedrecScore record);
}