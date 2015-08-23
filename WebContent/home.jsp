<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="org.neo.model.ProjectDetails" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h1>login success full</h1>

<table>
<form action="fillTask" method="post">
		<fieldset style="width: 300px">
			<legend> FILL TASK DETAILS </legend>
			<table>
				
				<tr>
					<td><input type="submit" value="FILL TASK DETAILS" /></td>
				</tr>
			</table>
		</fieldset>
	</form>
		
		
	<form action="getTask" method="post">
		<fieldset style="width: 300px">
			<legend> GET TASK DETAILS</legend>
			<table>
				
				<tr>
					<td><input type="submit" value="GetTaskDetails" /></td>
				</tr>
			</table>
		</fieldset>
	</form>
		

	</table>


</body>
</html>