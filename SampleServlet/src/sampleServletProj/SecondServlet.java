package sampleServletProj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OtherServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=Shift_JIS");
		PrintWriter out = response.getWriter();
		ServletContext con = this.getServletContext();
		String param = (String)con.getAttribute("param1");
		out.println("<h4>SecondServletです。</h4>");
		out.println("<p>渡された値は、「" + param + "」です。</p>");
		int res = 0;
		try {
			int n = Integer.parseInt(param);
			for (int i = 1;i <= n;i++)
				res += i;
		} catch(Exception ex) {
			res = -1;
		}
		out.println("<p>合計値：" + res + "（-1はエラー）</p>");
	}

}