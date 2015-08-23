package org.neo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.neo.model.ProjectDetails;

/**
 * Servlet implementation class GetTaskDetailsServlet
 */

public class GetTaskDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTaskDetailsServlet() {
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
         ProjectDetails pd=null;
         List<ProjectDetails> lpd = new ArrayList<ProjectDetails>();
         
         pd = new ProjectDetails();
         
         pd.setDate("22/23/3434");
         pd.setDescription("Description -1");
         pd.setFrom("FROM 22/22/2000");
         pd.setProject("JAVA");
         pd.setProjectType("JAVA PROJECT TYPE");
         pd.setTo("TO 22/22/2012");
         lpd.add(pd);
         
         
         pd = new ProjectDetails();
         
         pd.setDate("22/23/3434");
         pd.setDescription("Description -2");
         pd.setFrom("FROM 22/22/2003");
         pd.setProject("DOTNET");
         pd.setProjectType("DOTNET PROJECT TYPE");
         pd.setTo("TO 22/22/2012");
         lpd.add(pd);
         
         
         request.setAttribute("lpd", lpd);
         
         
         
         
         
         
         
         
        RequestDispatcher rd=request.getRequestDispatcher("taskdetails.jsp");
        rd.forward(request,response);
	}

}
