package sampleServletProj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class HelloWorld extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

    public HelloWorld() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=iso-2022-jp");
        request.setCharacterEncoding("iso-2022-jp");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("NAME");
        String id = request.getParameter("ID");
        String belongs = request.getParameter("BELONGS");
        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv=”Content-Type” content=”text/html; charset=Shift_JIS”>");
        out.println("<title>入力結果の確認</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<P>");
        out.println("以下の情報を受け取りました。");
        out.println("</P>");
        out.println("<TABLE border=\"1\">");
        out.println("<TR>");
        out.println("<TD>名前</TD>");
        out.println("<TD><FONT color=red>" + name + "</FONT></TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD>学籍番号</TD>");
        out.println("<TD><FONT color=red>" + id + "</FONT></TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD>所属</TD>");
        out.println("<TD><FONT color=red>" + belongs + "</FONT></TD>");
        out.println("</TR>");
        out.println("</TABLE>");
        out.println("<P>");
        out.println("情報を修正する場合は以下の戻るボタンを押してください。");
        out.println("<FORM method=\"GET\" action=\"./index.html\">");
        out.println("<INPUT type=\"submit\" value=\"戻る\">");
        out.println("</FORM>");
        out.println("</P>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
