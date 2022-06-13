<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <link rel=stylesheet type="text/css" href="css/golfschool.css">
  <title>GolfSchool</title>
</head>
<body>
  <h1>ゴルフスクール予約サイト</h1>

  <form action="login.do" method="post" class="login">
    <table>
	  <tr><td>ユーザ名</td></tr>
	  <tr><td><input type="text" name="user" size="16" value="" /></td></tr>
	  <tr><td>アカウント名</td></tr>
      <tr><td><input type="password" name="password" size="16" value="" /></td></tr>

    </table>

    <input type="submit" value="ログイン" />
  </form>
  <h2>ログイン出来ない場合はこちら</h2>
  <h2>ホームページへ移動</h2>

</body>
</html>
