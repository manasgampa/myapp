package net.antra.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.antra.business.InsertRecordModel;

public class InsertRecordServlet extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		String empId=request.getParameter("empId");
		String empName=request.getParameter("empName");
		String empSal=request.getParameter("sal");
		
		InsertRecordModel irm=new InsertRecordModel();
		boolean result=irm.insertRecord(empId, empName, empSal);
		if(result) {
			request.getRequestDispatcher("SuccessRecord.jsp").include(request, response);  
		}else {
			
		}
	}
	
}
