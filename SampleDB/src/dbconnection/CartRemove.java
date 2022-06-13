package dbconnection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tool.Page;


@WebServlet(urlPatterns= {"/CartRemove"})
public class CartRemove extends HttpServlet {

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);

		HttpSession session=request.getSession();

		session.removeAttribute("cart");
		Page.footer(out);
	}
}