package data.control;

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
import data.dao.mapper.HospitalMapper;
import data.dao.pojo.Hospital;
import data.dao.pojo.exp.HospitalExample;
import data.dao.pojo.exp.HospitalExample.Criteria;

@Controller
public class HospitalController extends BaseController {
	@Resource
	private HospitalExample hospitalExample;
	@Resource
	private HospitalMapper hospitalMapper;

	@RequestMapping("/search_hospital")
	public @ResponseBody ResponseData search(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer limit, @RequestParam(required = false) String code) {
		List<Hospital> result = null;
		PageInfo<Hospital> pageInfo = null;
		try {
			hospitalExample.clear();
			Criteria criteria = hospitalExample.or();
			if (code != null && !code.isEmpty()) {
				criteria.andCodeEqualTo(code);
			}
			// 获取page分页，limit条内容，默认查询总数count
			if (page != null && limit != null) {
				PageHelper.startPage(page, limit);
				result = hospitalMapper.selectByExample(hospitalExample);
				pageInfo = new PageInfo<Hospital>(result);
			} else {
				result = hospitalMapper.selectByExample(hospitalExample);
			}
			// 返回结果集合
			if (result != null) {
				return getResponse(WSCode.FIND_SUCCESS, result, pageInfo);
			} else {
				return getResponse(WSCode.FIND_FAILED, result, pageInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return getResponse(WSCode.DATABASE_EXCEPTION, result, pageInfo);
		}
	}

	@Override
	protected boolean isDuplicate(String code, String primaryKey) {
		return false;
	}

}
