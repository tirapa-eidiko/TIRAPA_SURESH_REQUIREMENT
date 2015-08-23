package org.neo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class LoginService {
	
	
	public static boolean validate(String uid,String pwd)
	{
	
	      if(uid.equals("tirapa")&&pwd.equals("tirapa")){
		  
		  return true;
		  }
		  
		
		boolean status = false;
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		String url="jdbc:mysql://localhost:3306/";
		String dbName="test_db";
		String driver="com.mysql.jdbc.Driver";
		String userName="root";
		String password="root";
		try {
			
			Class.forName(driver).newInstance();
			conn=DriverManager.getConnection(url+ dbName , userName, password);
			pst=conn.prepareStatement("select *from login where userid=? and password=?");
			
			pst.setString(1, uid);
			pst.setString(2, pwd);
			
			rs=pst.executeQuery();
			status=rs.next();
			
			
			
		} catch (Exception e) {
			
		}finally{
			if(conn !=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			if(pst !=null){
				try {
					pst.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			if(rs !=null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
		return status;
		
	}
	

}
