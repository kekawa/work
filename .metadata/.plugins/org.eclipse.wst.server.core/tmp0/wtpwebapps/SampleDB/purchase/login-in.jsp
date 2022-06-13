<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@include file="../tool/header.html" %>
<%@include file="menu.jsp" %>

<table style="border-collapse:separate;boder-spacing:10px;">

<p>ユーザIDとパスワードを入力してください</p>

<form action="Login.action" method="POST">
<p>ログイン名<input type="text" name="login"></p>
<p>パスワード<input type="password" name="password"></p>
<input type="submit" value="ログイン">
</form>

<table style="border-collapse:separate;boder-spacing:10px;">

<%@include file="../tool/footer.html" %>

<%--
ログイン可能ユーザ
/*'kawakami', 'abc' */
--%>
