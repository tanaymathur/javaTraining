package com.cg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/testSession")
public class SessionServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		
		 HttpSession session = req.getSession();
		 
		 Cookie cookie = new Cookie("sample", "sample");
		 resp.addCookie(cookie);
		 String url = resp.encodeURL("getDate");
		 resp.sendRedirect("getDate");
		
		 
		 System.out.println(session.getId());
	}

}
