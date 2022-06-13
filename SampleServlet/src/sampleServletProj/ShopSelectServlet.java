package sampleServletProj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet(urlPatterns={"/ShopSelectServlet"})

public class ShopSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ShopSelectServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=Shift_JIS");
		request.setCharacterEncoding("Shift_JIS");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3>トップページからご注文してください</h3>");
		out.println("</body></html>");
	}

	protected void doPost(
		HttpServletRequest request,HttpServletResponse response
	)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("UTF-8");
		String count = request.getParameter("count");
		String payment = request.getParameter("payment");
		String review = request.getParameter("review");
		String[] mail = request.getParameterValues("mail");

		Page.header(out);
		out.println("<p>"+count+"個の商品をカートに入れました。</p>");
		out.println("<p>お支払いを"+payment+"に設定しました。</p>");
		out.println("<p>ご感想ありがとうございます</p>");
		out.println("<p>「"+review+"」</p>");
		if(mail!=null) {
			for (String item : mail) {
				out.println("["+item+"]");
			}
			out.println("<p>に関するメールをお送りします。</p>");
		} else {
			out.println("<p>メールはお送りしません。</p>");
		}
		Page.footer(out);
	}
}