/**
 * Copyright 2009 Yusuke Komori. All rights reserved.
 */
package jp.littleforest.webtext.pentominosrv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ログイン時の処理を行うサーブレットです。<br />
 * 
 * @author y-komori
 */
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 9047808489131685958L;

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doPost(final HttpServletRequest request,
            final HttpServletResponse responce) throws ServletException,
            IOException {
        // リクエストパラメータから入力されたパスワードを取り出し
        String password = request.getParameter("password");

        String nextJsp;
        if ("webtext".equals(password)) {
            // パスワードが正しい場合
            // ユーザ名をリクエストに格納する
            String user = request.getParameter("user");
            request.setAttribute("user", user);

            // 遷移先を商品一覧画面にする
            nextJsp = "/itemList.jsp";
        } else {
            // パスワードが正しくなければ、遷移先をログイン失敗ページにする
            nextJsp = "/loginFailed.jsp";
        }

        // 遷移先のJSPへフォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher(nextJsp);
        dispatcher.forward(request, responce);
    }
}
