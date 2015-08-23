package org.neo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FillDetailsServelet
 */

public class FillDetailsServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FillDetailsServelet() {
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
		
		 List<String> listOfProjects = new ArrayList();
		 
		 listOfProjects.add("REDDY1");
		 listOfProjects.add("REDDY2");
		 listOfProjects.add("REDDY3");
		 listOfProjects.add("REDDY4");
		 listOfProjects.add("REDDY5");
		 listOfProjects.add("REDDY6");
		 listOfProjects.add("REDDY7");
		 
		 request.setAttribute("projects", listOfProjects);
		 
		 

        RequestDispatcher rd=request.getRequestDispatcher("filltask.jsp");
        rd.forward(request,response);
		
	}

}
