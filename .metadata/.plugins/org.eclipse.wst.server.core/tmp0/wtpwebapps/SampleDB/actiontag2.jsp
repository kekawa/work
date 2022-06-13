<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@include file="../tool/header.html" %>

<jsp:useBean id="product" class="bean.Product" scope="request" />

<jsp:getProperty name="product" property="id" />
<jsp:getProperty name="product" property="name" />
<jsp:getProperty name="product" property="price" />

<%@include file="../tool/footer.html" %>