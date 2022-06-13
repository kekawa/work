<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@include file="../tool/header.html" %>

<p>検索キーワードを入力してください</p>
<form action="Login.action" method="POST">
<p>ログイン名<input type="text" name="login"></p>
<p>パスワード<input type="password" name="password"></p>
<input type="submit" value="ログイン">
</form>

<%@include file="../tool/footer.html" %>


<%--
ログイン可能ユーザ
/*'ayukawa', 'SweetfishRiver1' */
--%>
