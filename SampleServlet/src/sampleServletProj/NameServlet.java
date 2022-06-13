package sampleServletProj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public NameServlet() {
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
		out.println("</body></html>");
	}

	protected void doPost(
		HttpServletRequest request,HttpServletResponse response
	)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("UTF-8");
		String str = request.getParameter("text1");

		out.println("<p>あなたのお名前：" + str + "</p>");
		out.println("<hr>");

	}
}