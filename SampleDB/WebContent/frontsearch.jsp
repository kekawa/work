<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<%@include file="../tool/header.html" %>

<p>検索キーワードを入力してください</p>
<form action="SampleDB/FrontSearch.action" method="POST">
<input type="text" name="keyword">
<input type="submit" value="検索">
</form>

<%@include file="../tool/footer.html" %>