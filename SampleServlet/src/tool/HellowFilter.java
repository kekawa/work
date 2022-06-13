package tool;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HellowFilter implements Filter{

	public void doFilter(ServletRequest request,ServletResponse response,
		FilterChain chain
	) throws IOException,ServletException{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("HellowFilter[pre]");
		chain.doFilter(request, response);
		out.println("HellowFilter[post]");
	}

	public void init(FilterConfig fiterconfig) {}
	public void destroy() {}

}


