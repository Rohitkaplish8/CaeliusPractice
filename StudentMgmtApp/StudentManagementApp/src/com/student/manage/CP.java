package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

	static Connection con;
	
	public static Connection  create()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user="root";
			String password="12345678";
			String url="jdbc:mysql://localhost:3306/student_manage";
			
			con = DriverManager.getConnection(url,user,password);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
}
