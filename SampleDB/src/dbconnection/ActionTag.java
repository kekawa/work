package dbconnection;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;

@WebServlet(urlPatterns= {"/actiontag"})
public class ActionTag extends HttpServlet {
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException {

		Product p=new Product();
		p.setId(1);
		p.setName("まぐろ");
		p.setPrice(100);

		request.setAttribute("product", p);
		request.getRequestDispatcher("actiontag.jsp").forward(request, response);
	}
}