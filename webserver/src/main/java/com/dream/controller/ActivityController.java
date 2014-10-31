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

import com.dream.basebean.RequestBean;
import com.dream.basebean.ResponseBean;
import com.dream.bean.Activity;
import com.dream.service.ActivityService;
import com.dream.utils.CommonUtils;
import com.google.gson.Gson;

@Controller
public class ActivityController {

	public static final Log LOG = LogFactory.getLog(ActivityController.class);
	private ResponseBean responseBean = new ResponseBean();
	private Gson gson = new Gson();
	private RequestBean requestBean;
	private Map<String, Object> content;

	@Resource(name = "activityService")
	private ActivityService activityService;

	@RequestMapping(value = "/addActivity", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean addActivity(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				Activity activity = gson.fromJson(content.toString(), Activity.class);
				CommonUtils.decriptObject(activity, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				activityService.addActivity(activity);
				responseBean.setContent(activity);
			} catch (Exception e) {
				LOG.error("业务执行异常...." + e.getMessage());
				responseBean.getMsg().setCode("0001");
				responseBean.getMsg().setDesc("业务异常");
				return responseBean;
			}
			LOG.info("业务执行成功，设置返回报文状态为成功...");
			responseBean.getMsg().setCode("0000");
			responseBean.getMsg().setDesc("成功");
			responseBean.setMac(requestBean.getHead().getSerial());
		}
		LOG.info("返回报文是:"+gson.toJson(responseBean));
		return responseBean;
	}

	@RequestMapping(value = "/detailActivity", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean detailActivity(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				//转化request请求中的 activity|获取条件
				Activity activity = gson.fromJson(content.toString(), Activity.class);
				//把需要解密的字段全部解密
				CommonUtils.decriptObject(activity, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				LOG.info(activityService.countActivity(activity));
				activity = activityService.detailActivity(activity);
				responseBean.setContent(activity);
			} catch (Exception e) {
				LOG.error("业务执行异常...." + e.getMessage());
				responseBean.getMsg().setCode("0001");
				responseBean.getMsg().setDesc("业务异常");
				return responseBean;
			}
			LOG.info("业务执行成功，设置返回报文状态为成功...");
			responseBean.getMsg().setCode("0000");
			responseBean.getMsg().setDesc("成功");
			responseBean.setMac(requestBean.getHead().getSerial());
		}

		return responseBean;
	}

	@RequestMapping(value = "/listActivity", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean listlActivity(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				Activity activity = gson.fromJson(content.toString(), Activity.class);
				CommonUtils.decriptObject(activity, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				List<Activity> activityList = activityService.listActivity(activity);
				responseBean.setContent(activityList);
			} catch (Exception e) {
				LOG.error("业务执行异常...." + e.getMessage());
				responseBean.getMsg().setCode("0001");
				responseBean.getMsg().setDesc("业务异常");
				return responseBean;
			}
			LOG.info("业务执行成功，设置返回报文状态为成功...");
			responseBean.getMsg().setCode("0000");
			responseBean.getMsg().setDesc("成功");
			responseBean.setMac(requestBean.getHead().getSerial());
		}

		return responseBean;
	}

	@RequestMapping(value = "/updateActivity", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean updateActivity(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				Activity activity = gson.fromJson(content.toString(), Activity.class);
				CommonUtils.decriptObject(activity, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				activityService.updateActivity(activity);
				responseBean.setContent(activity);
			} catch (Exception e) {
				LOG.error("业务执行异常...." + e.getMessage());
				responseBean.getMsg().setCode("0001");
				responseBean.getMsg().setDesc("业务异常");
				return responseBean;
			}
			LOG.info("业务执行成功，设置返回报文状态为成功...");
			responseBean.getMsg().setCode("0000");
			responseBean.getMsg().setDesc("成功");
			responseBean.setMac(requestBean.getHead().getSerial());
		}

		return responseBean;
	}

	@RequestMapping(value = "/deleteActivity", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean deleteActivity(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				Activity activity = gson.fromJson(content.toString(), Activity.class);
				CommonUtils.decriptObject(activity, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				responseBean.setContent(activity);
			} catch (Exception e) {
				LOG.error("业务执行异常...." + e.getMessage());
				responseBean.getMsg().setCode("0001");
				responseBean.getMsg().setDesc("业务异常");
				return responseBean;
			}
			LOG.info("业务执行成功，设置返回报文状态为成功...");
			responseBean.getMsg().setCode("0000");
			responseBean.getMsg().setDesc("成功");
			responseBean.setMac(requestBean.getHead().getSerial());
		}

		return responseBean;
	}
}