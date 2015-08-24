package org.neo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModifyProjectDetais
 */

public class ModifyProjectDetais extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyProjectDetais() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String value = request.getParameter("submit");
		
		PrintWriter pw = response.getWriter();
		
		pw.write(value);
		System.out.println(value);
		
		
		
		String date=request.getParameter("date");
		String from=request.getParameter("from");
		String to=request.getParameter("to");
		
		
		String database1=request.getParameter("database1");
		String tasktype=request.getParameter("tasktype");
		
		
		
		String description=request.getParameter("desc");
		System.out.println(date);
		System.out.println(from);
		System.out.println(to);
		System.out.println(database1);
		System.out.println(description);
		System.out.println(tasktype);
		pw.write(date);
		
		pw.write(date);
		
		pw.write(to);
		pw.write(database1);
		
		pw.write(description);
		
		
		
		
		
	}

}
