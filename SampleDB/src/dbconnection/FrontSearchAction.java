package dbconnection;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import dao.ProductDAO;
import tool.FrontAction;

public class FrontSearchAction extends FrontAction {

	public String execute (HttpServletRequest request,
			HttpServletResponse response)
	throws Exception {

		String keyword = request.getParameter("keyword");
		ProductDAO dao=new ProductDAO();
		List<Product> list=dao.search(keyword);
		request.setAttribute("list", list);

		return "frontlist.jsp";

	}
}