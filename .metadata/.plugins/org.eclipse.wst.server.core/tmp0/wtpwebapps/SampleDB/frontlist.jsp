<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@include file="../tool/header.html" %>
<%@page import="bean.Product,java.util.List" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% List<Product> list=(List<Product>)request.getAttribute("list"); %>

<%--
コメントアウト
<% for (Product p : list) { %>
  <p>${product.id}:${product.name}:${product.price}</p>
<% } %>

--%>

<c:forEach var="p" items="${list}">
	${p.id}：${p.name}：${p.price}<br>
</c:forEach>


<%@include file="../tool/footer.html" %>