<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="static/js/jquery-1.11.3.min.js"></script>
<title>userInfo</title>
</head>
<body>
	用户信息 昵称： ${userInfo.loginName} 用户id：${userInfo.id} 用户电话:${userInfo.telephone } 注册时间：
	<fmt:formatDate value="${userInfo.createdDate }" pattern="yyyy-MM-dd HH:mm:ss" />
	角色：[
	<%-- <c:forEach items="${ userInfo.acctRoles}" var="role">
	                    ${role.name }   权限[
	                       <c:forEach items="${ role.acctAuthorities}" var="authority">
	                         ${authority.name } 
	                       </c:forEach> ]
	                  </c:forEach> --%>
	]

	<br /> ajax显示全部用户信息：
	<div id="show_all_user"></div>
</body>
<script type="text/javascript">
	$.ajax({
		type : "get",
		url : "${pageContext.request.contextPath}/showInfos.html",
		dataType : "json",
		success : function(data) {
			$(data).each(
					function(i, user) {
						var p = "<p>昵称:" + user.loginName + "    电话:"
								+ user.telephone + "    注册时间:"
								+ user.createdDate + "    id:" + user.id +
						"</p>";
						$("#show_all_user").append(p);
					});
		},
		async : true
	});
</script>
</html>