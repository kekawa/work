<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../tool/header.html" %>
    <%-- メッセージ出力 --%>
    <p>Hellow!</p>
    <p>こんにちわ</p>
    <p><% out.println(new java.util.Date()); %></p>
<%@include file="../tool/footer.html" %>