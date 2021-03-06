<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/main.css" />
	
<script src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script> 
<script>

$(document).ready(function(){
	//设置body背景图片的宽度
	setBackGroundImg();
	
	$("#firstPage").click(function(){
		$("#centerFrame").attr("src","${pageContext.request.contextPath}/queryAnnouncement.action");
	});
	$("#sendAnn").click(function(){
		$("#centerFrame").attr("src","${pageContext.request.contextPath}/com/dreamheaven/sameCompany/createAnn.jsp");
	});
	$("#displayAllUser").click(function(){
		$("#centerFrame").attr("src","${pageContext.request.contextPath}/queryAllUser.action");
	});
	$("#displayNeedActiveUser").click(function(){
		$("#centerFrame").attr("src","${pageContext.request.contextPath}/queryNeedActiveUser.action");
	});
	$("#companyInfo").click(function(){
		$("#centerFrame").attr("src","${pageContext.request.contextPath}/companyInfo.action");
	});
	 
	getTime();
	 
});

	function setBackGroundImg() {
		var width = document.body.clientWidth;
		var height = document.body.clientHeight;
		$("#imgDiv").css({
			"width" : width,
			"height" : height
		});
	}
</script>
<style>
*{
	color:black;
}

#banner {
	height:100px;
}

#centerFrame {
	width: 880px;
}
</style>

</head>
<body>
	<img id="imgDiv" alt="" src="${pageContext.request.contextPath}/img/mainBackGround.gif" />
	
	<!-- 页面容器-->
	<div id="contain">
		<!--头部-->
		<div id="headPage">
			<!--索引链接,横幅图片以及日期显示-->
			<div id="banner">
				<div id="welcome">欢迎回来   ${companyInfo.companyName}公司管理 </div>
				<a href="${pageContext.request.contextPath}/logout.action">退出登录</a>
				<!-- 显示当前日期 -->
				<div id="bannerDate"></div>
			</div>
		</div>
		<!--虚线-->
		<div id="dottedLine"></div>
		<!--页面内容 -->
		<div id="bodyPage">
			<!--侧边栏，用于显示主要操作-->

			<div id="leftSideBar">
				<div class="divBlock" id="firstPage">首页</div>
				<br/>
				<div class="divBlock" id="sendAnn">发布公告</div>
				<br/>
				<div class="divBlock" id="displayAllUser">显示所有公司员工</div>
				<br/>
				<div class="divBlock" id="displayNeedActiveUser">所有需要激活的员工</div>
				<br/>
				<!-- <div class="divBlock" id="companyInfo">公司信息</div> -->	
				<br />
			</div>
			<!--内容显示-->
			<div id="bodyContent">
				<iframe id="centerFrame" name="centerFrame" frameborder="0"
					allowtransparency="true" src="${pageContext.request.contextPath}/queryAnnouncement.action"> </iframe>
			</div>
		</div>
		<!--虚线-->
		<div id="dottedLine"></div>
		<!--页脚-->
		<div id="foot"></div>
	</div>
</body>
</html>
