<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../tool/header.html" %>

    <%-- メッセージ出力 --%>
    <% request.setCharacterEncoding("UTF-8"); %>
    <p>こんにちは、<%=request.getParameter("user") %>さん！</p>

<%@include file="../tool/footer.html" %>