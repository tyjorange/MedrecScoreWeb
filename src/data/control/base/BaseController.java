package data.control.base;

import com.github.pagehelper.PageInfo;

import data.control.resp.ResponseData;

public abstract class BaseController {
	public static enum WSCode {
		FIND_SUCCESS(0, "查询成功"), 
		FIND_FAILED(1, "查询失败"), 
		ADD_UPDATE_SUCCESS(20, "添加/修改成功"), 
		ADD_UPDATE_FAILED(21, "添加/修改失败"), 
		ADD_UPDATE_DUPLICATE(22, "添加/修改失败-编码重复"), 
		DEL_SUCCESS(30, "删除成功"), 
		DEL_FAILED(31, "删除失败"), 
		WRONG_PARAMETER_FORMAT(4,"参数格式错误"), 
		WRONG_PARAMETER_VALUE(5, "参数值错误"), 
		DATABASE_EXCEPTION(6, "数据库操作失败"), 
		EMPTY_RESULT(121, "无结果"), 
		AUTH_FAILED(122, "权限错误"), 
		SUCCESS(100, "操作成功"), 
		FAILED(101, "操作失败");

		private int code; // 返回码
		private String desc; // 描述

		WSCode(int code, String desc) {
			this.code = code;
			this.desc = desc;
		}

		public int getCode() {
			return code;
		}

		public String getDesc() {
			return desc;
		}
	}

	/**
	 * 生成返回数据
	 * 
	 * @param wsCode
	 *            成功或错误代码
	 * @param result
	 *            查询出的数据
	 * @param pageInfo
	 *            分页信息
	 * @return
	 */
	public ResponseData getResponse(WSCode wsCode, Object result, PageInfo<?> pageInfo) {
		ResponseData response = new ResponseData();
		response.setCode(wsCode.getCode());
		response.setMsg(wsCode.getDesc());
		response.setData(result);
		response.setCount(pageInfo == null ? 0 : pageInfo.getTotal());
		return response;
	}

	/**
	 * 判断是否有重复数据
	 * 
	 * @param code
	 *            尝试修改的数据记录编号
	 * @param primaryKey
	 *            null 为新增 , not null 为修改
	 * @return false 不重复 true 重复
	 */
	protected abstract boolean isDuplicate(String code, String primaryKey);

}
