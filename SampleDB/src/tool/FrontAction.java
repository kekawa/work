package tool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class FrontAction {
	public abstract String execute (HttpServletRequest request,
		HttpServletResponse response) throws Exception ;
}

