<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@include file="../tool/header.html" %>

<p>ログアウトしますか？</p>
<p><a href="Logout.action">ログアウト</a></p>

<%@include file="../tool/footer.html" %>

<%--
動作確認手順
①logout-in.jspでログイン
②新しいタブで「http://localhost:8080/SampleDB/logout-in.jsp」を実行
③一度ログアウトする
④ブラウザの戻る
⑤ログアウトを押すと既にログアウトされていると表示
--%>