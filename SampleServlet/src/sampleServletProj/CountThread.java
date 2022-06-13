//synchronizedメソッドをコメントアウトすると
//サーブレットを起動した状態で複数のブラウザ（Chrom、Edgeなど）で
//同時更新を行うとカウントが片方キャンセルされる
package sampleServletProj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;
/**
 * Servlet implementation class Hellow
 */
@WebServlet("/Count-Thread")
public class CountThread extends HttpServlet {
	int count;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//toolパッケージ内のEncodingFilter.javaで設定
		//response.setContentType("text/plain; charset=UTF-8");
		PrintWriter out=response.getWriter();
		Page.header(out);

		synchronized(this) {
			int i = count;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
			count=i+1;
			out.println(count);
		}
			Page.footer(out);
	}

}
