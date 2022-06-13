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