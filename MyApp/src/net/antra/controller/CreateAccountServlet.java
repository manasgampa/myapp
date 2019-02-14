package net.antra.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.antra.business.CreateAccountModel;

public class CreateAccountServlet extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		String uName=request.getParameter("uname");
		String password=request.getParameter("password");
		CreateAccountModel cam=new CreateAccountModel();
		boolean result=cam.createAccount(uName, password);
		if(result) {
			request.getRequestDispatcher("SuccessAccount.jsp").include(request, response);  
		}else {
			
		}
		
	}
}
