package purchase;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Item;
import tool.FrontAction;

public class PreviewAction extends FrontAction {

	@SuppressWarnings("uncecked")
	public String execute (HttpServletRequest request,
			HttpServletResponse response)
	throws Exception {

		HttpSession session=request.getSession();

		if (session.getAttribute("customer")==null) {
			return "preview-error-login.jsp";
		}

		List<Item> cart=(List<Item>)session.getAttribute("cart");
		if (cart==null || cart.size()==0) {
			return "preview-error-cart.jsp";
		}

		return "purchase-in.jsp";

	}
}