package net.antra.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String uname=request.getParameter("name");
      String str= request.getRequestURI();
        HttpSession session = request.getSession();
        String sune=(String)session.getAttribute("uname");
       if(str.equals("/MyApp/index.html")) {
    	   
    	   request.getRequestDispatcher("index.html").forward(request, response);
       }else if(str.equals("/MyApp/CreateAccount.jsp") ||  str.equals("/MyApp/createAccount")) {
    	   
    	   chain.doFilter(request, response);
    	   return;
       }
       if(uname!=null) {
    	
        session.setAttribute("uname", uname);
    	 
       }else if(sune!=null){
    	   session.setAttribute("uname", sune);
    	 //  chain.doFilter(request, response);
       }else {
    	   request.getRequestDispatcher("login.html").forward(request, response);
    	   return;
       }
       
        if(session.getAttribute("uname")!=null) {
        	chain.doFilter(request, response);
        }else{
        	request.getRequestDispatcher("login.html").forward(request, response);
        	return;
        }
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
