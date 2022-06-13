<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../tool/header.html" %>
    <%-- メッセージ出力 --%>
    <p>名前を入力してください</p>
    <form action="greeting-out.jsp" method="post">
    <input type="text" name="user">
    <input type="submit" value="確定">
    </form>
<%@include file="../tool/footer.html" %>