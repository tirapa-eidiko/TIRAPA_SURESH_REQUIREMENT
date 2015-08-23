package org.neo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.neo.service.LoginService;

public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		
		 response.setContentType("text/html");    
	     PrintWriter out = response.getWriter(); 
	      
	      
	     String u=request.getParameter("userid");    
	     String p=request.getParameter("pass");   
		 System.out.println("hi this is from login controller  ...........");
	    
		HttpSession session = request.getSession(false);  
	      
	     if(session!=null)  
	        session.setAttribute("uid", u);  
	  
	        if(LoginService.validate(u, p)){    
	        	
	            RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
	            rd.forward(request,response);   
	            System.out.println("this is from login page success......");
	            
	            
	        }    
	        else{   
	        	
	        	 RequestDispatcher rd=request.getRequestDispatcher("error.jsp"); 
	        	/* out.print("<p style=\"color:red\">Sorry username or password error</p>");    */
	        	 rd.include(request,response);    
	        }    
	  
	        out.close(); 
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
