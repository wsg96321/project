package com.dream.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dream.annotation.RequestNeedParam;
import com.dream.basebean.PageBase;
import com.dream.basebean.RequestBean;
import com.dream.basebean.ResponseBean;
import com.dream.bean.Activity;
import com.dream.bean.User;
import com.dream.constants.Constant;
import com.dream.service.ActivityvipService;
import com.dream.utils.CommonUtils;
import com.google.gson.Gson;

@Controller
public class ActivityvipController {

	public static final Log LOG = LogFactory.getLog(ActivityvipController.class);
	private ResponseBean responseBean = new ResponseBean();
	private Gson gson = new Gson();
	private RequestBean requestBean;
	private Map<String, Object> content;

	@Resource(name = "activityvipService")
	private ActivityvipService activityvipService;

	@RequestNeedParam({"activityid","currentPage"})
	@RequestMapping(value = "/listActivityvip", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean listActivityvip(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				Activity activity = gson.fromJson(content.toString(), Activity.class);
				CommonUtils.decriptObject(activity, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				PageBase pageBase = CommonUtils.createNewPageBase(activity);
				//查询该活动对应的嘉宾信息
				List<User> userList = activityvipService.listUservip(activity);
				responseBean.setContent(CommonUtils.createListPage(userList , pageBase));
				responseBean.setContent(pageBase);
			} catch (Exception e) {
				e.printStackTrace();
				LOG.error("业务执行异常...." + e.getMessage());
				responseBean.getMsg().setCode("0001");
				responseBean.getMsg().setDesc(Constant.CODE_0001);
				return responseBean;
			}
			LOG.info("业务执行成功，设置返回报文状态为成功...");
			responseBean.getMsg().setCode("0000");
			responseBean.getMsg().setDesc(Constant.CODE_0000);
			responseBean.setMac(requestBean.getHead().getSerial());
		}

		return responseBean;
	}

}
