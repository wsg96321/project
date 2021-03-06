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
import com.dream.bean.Comment;
import com.dream.service.CommentService;
import com.dream.utils.CommonUtils;
import com.google.gson.Gson;

@Controller
public class CommentController {

	public static final Log LOG = LogFactory.getLog(CommentController.class);
	private ResponseBean responseBean = new ResponseBean();
	private Gson gson = new Gson();
	private RequestBean requestBean;
	private Map<String, Object> content;

	@Resource(name = "commentService")
	private CommentService commentService;

//	@RequestMapping(value = "/addComment", method = { RequestMethod.POST })
//	@ResponseBody
//	public ResponseBean addComment(String request) {
//		requestBean = gson.fromJson(request, RequestBean.class);
//		// 进行校验
//		if (requestBean.checkMac()) {
//			LOG.info("校验成功....");
//			// 真正的业务逻辑
//			try {
//				content = requestBean.getContent();
//				Comment comment = gson.fromJson(content.toString(), Comment.class);
//				CommonUtils.decriptObject(comment, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
//				commentService.addComment(comment);
//				responseBean.setContent(comment);
//			} catch (Exception e) {
//				LOG.error("业务执行异常...." + e.getMessage());
//				responseBean.getMsg().setCode("0001");
//				responseBean.getMsg().setDesc("业务异常");
//				return responseBean;
//			}
//			LOG.info("业务执行成功，设置返回报文状态为成功...");
//			responseBean.getMsg().setCode("0000");
//			responseBean.getMsg().setDesc("成功");
//			responseBean.setMac(requestBean.getHead().getSerial());
//		}
//		LOG.info("返回报文是:"+gson.toJson(responseBean));
//		return responseBean;
//	}

//	@RequestMapping(value = "/detailComment", method = { RequestMethod.POST })
//	@ResponseBody
//	public ResponseBean detailComment(String request) {
//		requestBean = gson.fromJson(request, RequestBean.class);
//		// 进行校验
//		if (requestBean.checkMac()) {
//			LOG.info("校验成功....");
//			// 真正的业务逻辑
//			try {
//				content = requestBean.getContent();
//				Comment comment = gson.fromJson(content.toString(), Comment.class);
//				CommonUtils.decriptObject(comment, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
//				comment = commentService.detailComment(comment);
//				responseBean.setContent(comment);
//			} catch (Exception e) {
//				LOG.error("业务执行异常...." + e.getMessage());
//				responseBean.getMsg().setCode("0001");
//				responseBean.getMsg().setDesc("业务异常");
//				return responseBean;
//			}
//			LOG.info("业务执行成功，设置返回报文状态为成功...");
//			responseBean.getMsg().setCode("0000");
//			responseBean.getMsg().setDesc("成功");
//			responseBean.setMac(requestBean.getHead().getSerial());
//		}
//
//		return responseBean;
//	}

	// 根据传入的参数，返回一个评论是否已被赞，已经总的点赞数
	@RequestNeedParam({"currentPage","themeid","userid"})
	@RequestMapping(value = "/listComment", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseBean listComment(String request) {
		requestBean = gson.fromJson(request, RequestBean.class);
		// 进行校验
		if (requestBean.checkMac()) {
			LOG.info("校验成功....");
			// 真正的业务逻辑
			try {
				content = requestBean.getContent();
				Comment comment = gson.fromJson(content.toString(), Comment.class);
				CommonUtils.decriptObject(comment, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
				PageBase pageBase = CommonUtils.createNewPageBase(comment);
				List<Comment> commentList = commentService.listCommentAndPraise(comment,pageBase);
				responseBean.setContent(commentList);
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

//	@RequestMapping(value = "/updateComment", method = { RequestMethod.POST })
//	@ResponseBody
//	public ResponseBean updateComment(String request) {
//		requestBean = gson.fromJson(request, RequestBean.class);
//		// 进行校验
//		if (requestBean.checkMac()) {
//			LOG.info("校验成功....");
//			// 真正的业务逻辑
//			try {
//				content = requestBean.getContent();
//				Comment comment = gson.fromJson(content.toString(), Comment.class);
//				CommonUtils.decriptObject(comment, requestBean.getHead().getImei(), requestBean.getHead().getImsi());
//				commentService.updateComment(comment);
//				responseBean.setContent(comment);
//			} catch (Exception e) {
//				LOG.error("业务执行异常...." + e.getMessage());
//				responseBean.getMsg().setCode("0001");
//				responseBean.getMsg().setDesc("业务异常");
//				return responseBean;
//			}
//			LOG.info("业务执行成功，设置返回报文状态为成功...");
//			responseBean.getMsg().setCode("0000");
//			responseBean.getMsg().setDesc("成功");
//			responseBean.setMac(requestBean.getHead().getSerial());
//		}
//
//		return responseBean;
//	}

}
