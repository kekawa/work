<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <link rel=stylesheet type="text/css" href="css/pentomino.css">
  <title>ピザ・ペントミノ - ログイン</title>
</head>
<body>
  <h1>ピザ・ペントミノへようこそ！</h1>

  <form action="login.do" method="post" class="login">
    <table>
    <tr>
      <td>ユーザ名</td>
      <td><input type="text" name="user" size="16" value="" /></td>
    </tr>
    <tr>
      <td>パスワード</td>
      <td><input type="password" name="password" size="16" value="" /></td>
    </tr>
    </table>
    
    <input type="submit" value="ログイン" />
  </form>

</body>
</html>
