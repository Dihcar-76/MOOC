package webcart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// TODO: add an annotation here to map your servlet on an URL.
@WebServlet(value="/mycart")
public class WebCartServlet extends HttpServlet {
	
	Cart myCart = new Cart();


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {
		// TODO : print a html form using printwriter.
		//PrintWriter out = res.getWriter();
		//out.println("<!DOCTYPE html>");
		//res.setContentType("text/html");
		/*myCart = (Cart) req.getAttribute("myCart");
		if (myCart == null){
			myCart = new Cart();
		}*/
		req.setAttribute("myCart", myCart);
		/*
		out.println("<html>");
		out.println("<body>");
		out.println("<div>");
		out.println("<form method=\"POST\" action=\"/myeshop/mycart\">");
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
		out.println("</body>");
		out.println("</html>");
		*/
		this.getServletContext().getRequestDispatcher("/cart.jsp").forward(req, res);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {
		PrintWriter out = res.getWriter();

		// TODO : Get parameters, check null
		if(req.getParameter("ref").isEmpty() || req.getParameter("qty").isEmpty()){
			out.println("Un des paramètres est vide");
			res.setStatus(400);

		}
		

		else{
			// TODO : print reference and quantity
			//out.println("référence: "+req.getParameter("ref")+" qté: "+req.getParameter("qty"));
			//Cart myCart = new Cart();
			//myCart = (Cart) req.getAttribute("myCart");

			//out.println(myCart);
			myCart.addToCart(req.getParameter("ref"), Integer.parseInt(req.getParameter("qty")));
			req.setAttribute("myCart", myCart);
			//res.sendRedirect("mycart");
			this.getServletContext().getRequestDispatcher("/cart.jsp").forward(req, res);
		}
	}
	
	
	

}
