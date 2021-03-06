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
import com.dream.bean.Theme;
import com.dream.service.ThemeService;
import com.dream.utils.CommonUtils;
import com.google.gson.Gson;

@Controller
public class ThemeController {

	public static final Log LOG = LogFactory.getLog(ThemeController.class);
	private ResponseBean responseBean = new ResponseBean();
	private Gson gson = new Gson();
	private RequestBean requestBean;
	private Map<String, Object> content;

	@Resource(name = "themeService")
	private ThemeService themeService;

	@RequestMapping(value = "/addTheme", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean addTheme(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				Theme theme = gson.fromJson(content.toString(), Theme.class);
				CommonUtils.decriptObject(theme, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				themeService.addTheme(theme);
				responseBean.setContent(theme);
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

	@RequestMapping(value = "/detailTheme", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean detailTheme(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				Theme theme = gson.fromJson(content.toString(), Theme.class);
				CommonUtils.decriptObject(theme, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				theme = themeService.detailTheme(theme);
				responseBean.setContent(theme);
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
	
	@RequestNeedParam({"currentPage","activityid"})
	@RequestMapping(value = "/listTheme", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean listTheme(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				Theme theme = gson.fromJson(content.toString(), Theme.class);
				CommonUtils.decriptObject(theme, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				PageBase pageBase = CommonUtils.createNewPageBase(theme);
				List<Theme> themeList = themeService.listThemeInclueCommentCount(theme);
				responseBean.setContent(CommonUtils.createListPage(themeList, pageBase));
				responseBean.setContent(pageBase);
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
	
	

	/**
	 * 列出我参与过的话题
	 * @param request
	 * @return
	 */
	@RequestNeedParam({"currentPage","activityid","userid"})
	@RequestMapping(value = "/listOwnTheme", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean listOwnTheme(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				Theme theme = gson.fromJson(content.toString(), Theme.class);
				CommonUtils.decriptObject(theme, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				PageBase pageBase = CommonUtils.createNewPageBase(theme);
				List<Theme> themeList = themeService.listThemeInclueCommentCount(theme);
				responseBean.setContent(CommonUtils.createListPage(themeList, pageBase));
				responseBean.setContent(pageBase);
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
	

	@RequestMapping(value = "/updateTheme", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean updateTheme(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				Theme theme = gson.fromJson(content.toString(), Theme.class);
				CommonUtils.decriptObject(theme, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				themeService.updateTheme(theme);
				responseBean.setContent(theme);
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

	@RequestMapping(value = "/deleteTheme", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean deleteTheme(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				Theme theme = gson.fromJson(content.toString(), Theme.class);
				CommonUtils.decriptObject(theme, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				responseBean.setContent(theme);
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
