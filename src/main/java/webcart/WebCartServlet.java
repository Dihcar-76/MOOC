package webcart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// TODO: add an annotation here to map your servlet on an URL.
@WebServlet(value="/hello")
public class WebCartServlet extends HttpServlet {
	
	Cart myCart = new Cart();
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {
		// TODO : print a html form using printwriter.
		PrintWriter out = res.getWriter();
		//out.println("<!DOCTYPE html>");
		res.setContentType("text/html");
		out.println("<form>");
		out.println("<div>");
		out.println("<form method=\"POST\" action=\"/myeshop/hello\">");
		out.println("<table>");//start of printing
		out.println("<tr>");//table row
		out.println("<td>");//table data
		out.println("<label for=\"ref\">Référence :</label>");
		out.println("</td>");//table data
		out.println("<td>");//table data
		out.println("<input type=\"text\" id=\"ref\" name=\"ref\"/>");
		out.println("</td>");//table data
		out.println("</tr>");//table row
		//out.println("</BR>");
		out.println("<tr>");//table row
		out.println("<td>");//table data
        out.println("<label for=\"qty\">Quantity :</label>");
		out.println("</td>");//table data
		out.println("<td>");//table data
        out.println("<input type=\"number\" id=\"qty\" name=\"qty\"/>");
		out.println("</td>");//table data
		out.println("</tr>");//table row
		out.println("</table>");
		out.println("</BR>");
		out.println("<input type=\"submit\" value=\"Valider\"/>");
		out.println("</div>");
		out.println("</form>");

	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		
		// TODO : Get parameters, check null
		
		// TODO : print reference and quantity

	}
	
	
	

}
