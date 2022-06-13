<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<%@include file="../tool/header.html" %>

<p>追加する商品を入力してください</p>
<form action="FrontInsert.action" method="POST">
商品名<input type="text" name="name">
価格<input type="text" name="price">
<input type="submit" value="追加">
</form>

<%@include file="../tool/footer.html" %>