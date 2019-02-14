package net.antra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet{
public void service(HttpServletRequest servletRequest,HttpServletResponse servletResponse) throws IOException, ServletException {
		
        HttpSession session=servletRequest.getSession();  
        session.invalidate();  
        servletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
      //  servletResponse.setHeader("Pragma", "no-cache");
        servletRequest.getRequestDispatcher("Logout.jsp").include(servletRequest, servletResponse);  
        
	}

}
