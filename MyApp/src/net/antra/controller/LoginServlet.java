package net.antra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.antra.business.LoginModel;

public class LoginServlet extends HttpServlet{
	


	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("name");
		String password=request.getParameter("password");
		
		boolean value=false;
		if(uname.trim()!=null && password.trim()!=null) {
			LoginModel lModel=new LoginModel();
			value=lModel.ValidateCredentials(uname, password);
			if(value) {
				HttpSession hsession=request.getSession();
				hsession.setAttribute("uname", uname);
				request.getRequestDispatcher("link.jsp").include(request, response);  
			}else {
				 
				HttpSession hsession=request.getSession(false);
				if(hsession!=null) {
				hsession.invalidate();
				}
				request.getRequestDispatcher("ErrorAuthendication.html").include(request, response);  
			}
		
		}else {
			
			request.getRequestDispatcher("valid.html").include(request, response);  
		}
		
		
		
		
		
		
		
		
	}

}
