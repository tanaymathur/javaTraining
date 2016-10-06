package com.seed;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//	TODO:1 Make DisplayCartDetailsServlet as a HttpServlet

@WebServlet("/displayDetails")
public class DisplayCartDetailsServlet extends HttpServlet {

	// TODO:2 Provide call-back method (called by web container) for HTTP
	// request made using HTTP GET method
	// TODO:3 This method should read products selected by web-client from
	// bookCatelogue.html and
	// display them in tabular format as html response to the web client
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String[] products =req.getParameterValues("bookName");
		System.out.println(products);
		PrintWriter out = resp.getWriter();
		
		out.println("<html><body>");
		out.println("<table>");
		for (int it = 0; it < products.length; it++) {
			out.println("<tr>");
			System.out.println(products[it]);
			out.println("<td>"+products[it]+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body></html>");
		
	}

}