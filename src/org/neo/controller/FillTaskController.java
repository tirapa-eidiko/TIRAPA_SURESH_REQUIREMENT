package org.neo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FillTaskController
 */

public class FillTaskController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
		
		
	
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
				   
			String date=request.getParameter("date");
			String from=request.getParameter("from");
			String to=request.getParameter("to");
			
			
			String project=request.getParameter("project");
			String tasktype=request.getParameter("tasktype");
			
			
			
			String description=request.getParameter("description");
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection  conn=DriverManager.getConnection
	                     ("jdbc:mysql://localhost:3306/test_db","root","root");
				
				System.out.println("this is START WITH  DATA SAVING IN THE DATABASE  ");
				// stmt = conn.createStatement();
				
				
				
				PreparedStatement ps=conn.prepareStatement("insert into projects(`date`,`from`,`to`,`project`,`tasktype`,`description`)values(?,?,?,?,?,?);");
				
				
				
				
				
				ps.setString(1, date);
		        ps.setString(2, from);
		        ps.setString(3, to);
		        ps.setString(4, project);
		        ps.setString(5, tasktype);
		        ps.setString(6, description);
		        int i=ps.executeUpdate();
		        if(i>0)
		          {
		            out.println("You are sucessfully saved details");
		          }
				
			} catch (Exception se) {
				se.printStackTrace();
			}
		
	

	}
	
	 
}
