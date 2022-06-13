package dbconnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tool.FrontAction;

public class LogoutAction extends FrontAction {

	public String execute (HttpServletRequest request,
			HttpServletResponse response)
	throws Exception {

		HttpSession session=request.getSession();

		if ( session.getAttribute("customer")!=null) {
			session.removeAttribute("customer");
			return "logout-out.jsp";
		}

		return "logout-error.jsp";

	}
}