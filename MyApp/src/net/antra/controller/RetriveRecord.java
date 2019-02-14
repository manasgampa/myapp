package net.antra.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.antra.VO.EmployeeVO;

public class RetriveRecord extends HttpServlet{

	
	public void service(HttpServletRequest request,HttpServletResponse response) {
		
		List al=new ArrayList();
		al.add(new EmployeeVO("1","manas",123));
		al.add(new EmployeeVO("2","kumar",1234));
		al.add(new EmployeeVO("3","jagdish",1235));
		al.add(new EmployeeVO("4","kiran",1236));
		al.add(new EmployeeVO("5","kishore",1237));
		al.add(new EmployeeVO("6","vikram",1238));
		al.add(new EmployeeVO("7","Richard",1239));
		al.add(new EmployeeVO("8","paul",1230));
		request.setAttribute("al", al);
		try {
			request.getRequestDispatcher("ShowRecords.jsp").include(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
