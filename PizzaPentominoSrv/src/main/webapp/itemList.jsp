<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<jsp:useBean id="user" type="java.lang.String" scope="request" />

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel=stylesheet type="text/css" href="css/pentomino.css">
    <title>ピザ・ペントミノ - 商品一覧</title>
</head>

<body>
<h1>ピザ・ペントミノ - 商品一覧</h1>

<div align="center">
    <h2><%=user %>さん、お好きなピザを選んでください</h2>

    <form>
        <table class="menu">
        <tr>
            <td><input type="checkbox" name="itemA" value="checked" /></td>
            <td>マルゲリータ</td>
            <td class="price">&yen;800</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="itemB" value="checked" /></td>
            <td>バジル・トマト</td>
            <td class="price">&yen;900</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="itemC" value="checked" /></td>
            <td>ナス・ミートソース</td>
            <td class="price">&yen;1,000</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="itemD" value="checked"/></td>
            <td>アンチョビ・シーフード</td>
            <td class="price">&yen;1,000</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="itemE" value="checked" /></td>
            <td>チーズ・ミルフィーユ</td>
            <td class="price">&yen;1,300</td>
        </tr>
        </table>
        <input type="button" value="チェックした商品をカートに入れる" />
    </form>
    
    <form>
        <input type="button" value="カートの内容を確認して注文へ進む" />
    </form>
    
    <form>
        <input type="button" value="ログアウト" />
    </form>
</div>

</body>
</html>
