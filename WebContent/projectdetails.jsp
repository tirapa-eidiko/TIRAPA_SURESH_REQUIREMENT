<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@ page import="java.sql.*" %>
<%ResultSet rs =null;%>

<HTML>
<HEAD>
    <TITLE>Select element drop down box</TITLE>
</HEAD>

<BODY >

<%
    try{
//Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection connection = 
         DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/test_db?user=root&password=root");

       Statement statement = connection.createStatement() ;
       resultset =statement.executeQuery("select * from projects") ;
%>
		<center>
    <h1> Drop down box or select element</h1>
        <select>
        <%  while(resultset.next()){ %>
            <option><%= resultset.getString(1)%></option>
        <%} %>
        </select></center>


<form action="filltask" method="post">
		<fieldset style="width: 300px">
			<legend>Task Details </legend>
			<table>
				<tr>
					<td>Date</td>
					<td><input type="text" name="date" required="required" /></td>
				</tr>
				<tr>
					<td>From</td>
					<td><input type="text" name="from" required="required" /></td>
				</tr>
				
				<tr>
					<td>To</td>
					<td><input type="text" name="to" required="required" /></td>
				</tr>
				
				<tr>
					<td>Project</td>
					<td><input type="text" name="project" required="required" /></td>
				</tr>
				
				<tr>
					<td>Task Type</td>
					<td><input type="text" name="tasktype" required="required" /></td>
				</tr>
								
				<tr>
					<td>Description</td>
					<td><input type="text" name="desc" required="required" /></td>
				</tr>
				
				
				
				
				
				
				
				
				
				<tr>
					<td><input type="submit" value="Login" /></td>
				</tr>
			</table>
		</fieldset>
	</form>



</BODY></HTML> --%>