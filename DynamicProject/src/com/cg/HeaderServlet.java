package com.cg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getHeaders")
public class HeaderServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		Enumeration<String> headerNames=req.getHeaderNames();
		PrintWriter out = resp.getWriter();
		
		out.println("<html><body>");
		out.println("<table>");
		while(headerNames.hasMoreElements()){
			String header = headerNames.nextElement();
			String value = req.getHeader(header);
			out.println("<tr>");
			out.println("<td>"+header+"</td><td>"+value+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</html></body>");
	}


}
