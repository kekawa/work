package sampleServletProj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FirstServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=Shift_JIS");
		request.setCharacterEncoding("Shift_JIS");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3>GET</h3>");
		out.println("<h3>URLを直接入力しないでください</h3>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=Shift_JIS");
		PrintWriter out = response.getWriter();
		String str = request.getParameter("text1");
		out.println("<H3>これはFirstServletの表示です。</h3>");
		out.println("<p>入力された数字：" + str + "</p>");
		out.println("<hr>");
		ServletContext con = this.getServletContext();
		con.setAttribute("param1",str);
		RequestDispatcher dis = con.getRequestDispatcher("/SecondServlet");
		dis.include(request,response);
		out.println("<hr>");
		out.println("<H3>これはFirstServletの表示です。</h3>");
		out.println("<p>以上。</p>");
	}
}