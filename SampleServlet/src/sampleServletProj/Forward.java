package sampleServletProj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/forward"})
public class Forward extends HttpServlet {


	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
			request.getRequestDispatcher("/WebContent/WEB-INF/forward.jsp")
			.forward(request, response);
	}

}
