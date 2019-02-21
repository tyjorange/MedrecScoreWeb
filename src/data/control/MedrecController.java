package data.control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import data.control.base.BaseController;
import data.control.resp.ResponseData;
import data.dao.mapper.MedrecMapper;
import data.dao.mapper.MedrecScoreMapper;
import data.dao.pojo.Medrec;
import data.dao.pojo.MedrecScore;
import data.dao.pojo.exp.MedrecExample;
import data.dao.pojo.exp.MedrecExample.Criteria;
import data.dao.pojo.exp.MedrecScoreExample;
import data.progress.Main;

@Controller
public class MedrecController extends BaseController {
	@Resource
	private MedrecExample medrecExample;
	@Resource
	private MedrecMapper medrecMapper;
	@Resource
	private MedrecScoreExample medrecScoreExample;
	@Resource
	private MedrecScoreMapper medrecScoreMapper;

	@RequestMapping("/search_medrec")
	public @ResponseBody ResponseData search(@RequestParam(required = true) Integer page, @RequestParam(required = true) Integer limit, @RequestParam(required = false) String id, @RequestParam(required = false) String code) {
		List<Medrec> result = null;
		PageInfo<Medrec> pageInfo = null;
		List<MedrecScore> progress = null;
		try {
			medrecExample.clear();
			Criteria criteria = medrecExample.or();
			if (id != null && !id.isEmpty()) {
				criteria.andIdEqualTo(id);
			}
			if (code != null && !code.isEmpty()) {
				criteria.andCodeEqualTo(code);
			}
			// 获取page分页，limit条内容，默认查询总数count
			if (page != null && limit != null) {
				PageHelper.startPage(page, limit);
				result = medrecMapper.selectByExample(medrecExample);
				pageInfo = new PageInfo<Medrec>(result);
			} else {
				result = medrecMapper.selectByExample(medrecExample);
			}
			// 返回结果集合
			if (result != null) {
				progress = Main.progress(result);// TODO
				return getResponse(WSCode.FIND_SUCCESS, progress, pageInfo);
			} else {
				return getResponse(WSCode.FIND_FAILED, progress, pageInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return getResponse(WSCode.DATABASE_EXCEPTION, result, pageInfo);
		}
	}

	@RequestMapping("/search_medrec_insert_batch")
	public @ResponseBody ResponseData searchInsertBatch() {
		Integer page = 1;// 1
		Integer pageAll = 2346;// 2346
		Integer limit = 1000;// 1000
		List<Medrec> result = null;
		PageInfo<Medrec> pageInfo = null;
		List<MedrecScore> progress = null;
		try {
			for (int i = page; page <= pageAll; i++) {
				// medrecExample.clear();
				PageHelper.startPage(i, limit);
				result = medrecMapper.selectByExample(medrecExample);
				pageInfo = new PageInfo<Medrec>(result);
				if (result != null) {
					progress = Main.progress(result);// TODO
					int insertCount = 0;
					List<MedrecScore> resList = new ArrayList<MedrecScore>();
					for (MedrecScore ms : progress) {
						if (isDuplicate(ms.getCode(), ms.getId())) {
							System.out.println("isDuplicate " + ms.getId());
						} else {
							resList.add(ms);
						}
					}
					if (resList.size() != 0) {
						insertCount += medrecScoreMapper.insertBatch(resList);
					}
					System.out.println(page + "/" + pageAll + " insertCount " + insertCount);
					page++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return getResponse(WSCode.DATABASE_EXCEPTION, progress, pageInfo);
		}
		return getResponse(WSCode.FIND_SUCCESS, progress, pageInfo);
	}

	@Override
	protected boolean isDuplicate(String code, String primaryKey) {
		MedrecScore ms = medrecScoreMapper.selectByPrimaryKey(primaryKey);
		if (ms != null) {
			return true;
		}
		return false;
	}
}
