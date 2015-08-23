<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.util.*" %>
    <%@ page import="org.neo.model.ProjectDetails" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%

List<ProjectDetails> lpd =(ArrayList) request.getAttribute("lpd");





%>
<th>TASK DETAILS</th> <br/><br/><br/>




<c:forEach items="${lpd}" var="pd">




<table>
		<tr>
			<td>Date</td>
			<td><input type="text" name="date" value="${pd.to}" required="required" /></td>
		</tr>
		
		<tr>
			<td>From</td>
			<td><input type="text" name="from"  value="${pd.from}" required="required" /></td>
			
			<td>To</td>
			<td><input type="text" name="to" value="${pd.to}" required="required" /></td>
		</tr>

		<tr>
			
			<td><select name="database1">
							
							
							<option> <c:out value="${pd.project}"/> </option>
							
					</select></td>
			
		</tr>


		<tr>
			<td>Task Type</td>
			<td><input type="text" name="tasktype" value="${pd.projectType}" required="required" /></td>
		</tr>
		
		<tr>
			<td>Project Description</td>
			<td><input type="text" name="desc"  value="${pd.description}" required="required" /></td>
		</tr>

		<tr>
			<td><input type="submit" value="Update" /></td>
			<td><input type="submit" value="Delete" /></td>
		</tr>
	</table>


    
</c:forEach>



</body>
</html>