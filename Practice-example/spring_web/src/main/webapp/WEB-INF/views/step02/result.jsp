<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${userinfo.username } (${userinfo.userid })님이 선택하신 과일은
	<c:if test="${!empty userinfo.fruit }">
		<c:forEach var="f" items="${userinfo.fruit }">
			${f }  
		</c:forEach>
	</c:if>
	<c:if test="${empty userinfo.fruit }">
	</c:if>
</body>
</html>