<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@include file="../tool/header.html" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="p" items="${list}">
	${p.id}：${p.name}：${p.price}<br>
</c:forEach>

<%@include file="../tool/footer.html" %>