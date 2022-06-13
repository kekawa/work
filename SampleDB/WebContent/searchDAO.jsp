<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@include file="../tool/header.html" %>

<p>検索キーワードを入力してください</p>
<form action="SearchDAO" method="POST">
<input type="text" name="keyword">
<input type="submit" value="検索">
</form>

<%@include file="../tool/footer.html" %>