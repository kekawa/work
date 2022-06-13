<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%@include file="../tool/header.html" %>

<p>カートに追加する商品を入力してください。</p>
<form action="CartAdd" method="post">
商品名<input type="text" name="name">
価格<input type="text" name="price">
<input type="submit" value="追加">
</form>

<%@include file="../tool/footer.html" %>