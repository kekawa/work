<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@include file="../tool/header.html" %>

<p>追加キーワードを入力してください</p>
<form action="Insert" method="POST">
商品名：<input type="text" name="name">
価格：<input type="text" name="price">
<input type="submit" value="追加">
</form>

<%@include file="../tool/footer.html" %>