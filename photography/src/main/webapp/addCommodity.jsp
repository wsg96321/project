<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<title>新闻添加页</title>
<!-- 以下1行为upload空间  -->
<script src="./js/jquery-1.9.1.js" type="text/javascript"></script>

<script type="text/javascript">
	    $(document).ready(function() {
	    				
		});
</script>
</head>
<body>
	<div style="color: red;">${message.messageInfo}</div>


<iframe id="myiframe" style="height: 500px ; width: 500px;" src="uploadCommodity.jsp"></iframe>

</body>
</html>