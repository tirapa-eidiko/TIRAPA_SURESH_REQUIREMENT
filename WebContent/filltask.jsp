<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% // get the list of projects from request
	List<String> listOfProjects = (List<String>)request.getAttribute("projects"); 
	%>

<form action="fillTaskController" method="post">
		<fieldset style="width: 300px">
			<legend> Task Details</legend>

<table>
		<tr>
			<td>Date</td>
			<td><input type="text" name="date" required="required" /></td>
		</tr>
		
		<tr>
			<td>From</td>
			<td><input type="text" name="from" required="required" /></td>
			
			<td>To</td>
			<td><input type="text" name="to" required="required" /></td>
		</tr>

		<tr>
			<%-- <td>Project</td>
			<select name="projects">
 				<c:forEach var="pjt" items="${list}">
  			 	<option> <c:out value="${pjt}"/> </option>
			    </c:forEach>
				</select>

			<td><input type="text" name="Project" required="required" /></td> --%>
			
			<td><select name="database1">
							<option value="" selected>select</option>
							<%
								String field = null;
								for (int i = 0; i < listOfProjects.size(); i++) {
									field = listOfProjects.get(i).toString();
							%>
							<option value="<%=field%>"><%=field%></option>
							<%
								}
							%>
					</select></td>
			
		</tr>


		<tr>
			<td>Task Type</td>
			<td><input type="text" name="tasktype" required="required" /></td>
		</tr>
		
		<tr>
			<td>Project Description</td>
			<td><input type="text" name="desc" required="required" /></td>
		</tr>

		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>

</fieldset></form>


</body>
</html>