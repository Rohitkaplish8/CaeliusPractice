package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	public static boolean insertStudentToDB(Student st)
	{
	
	boolean f = false;
		try
		{
		Connection con = CP.create();
		String q = "insert into students(sname,sphone,scity) values(?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(q);
		
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentPhone());
		pstmt.setString(3, st.getStudentCity());
		
		
		pstmt.executeUpdate();
		f= true;
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
}
	
	public static boolean deleteStudentFromDB(int userId)
	{
	
	boolean f = false;
		try
		{
		Connection con = CP.create();
		String q = "delete from students where sid=?";
		
		PreparedStatement pstmt = con.prepareStatement(q);
	pstmt.setInt(1,userId);
	
		
		pstmt.executeUpdate();
		f= true;
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
}

	public static void displayStudentData() {
	
		
		try
		{
		Connection con = CP.create();
		String q = "select * from students";
		
	   Statement stmt = con.createStatement();
	   
	   ResultSet resultSet=stmt.executeQuery(q);	
	   
	   
	   while(resultSet.next())
	   {
		   
		  int sID= Integer.parseInt(resultSet.getString(1));
		   String sName  =  resultSet.getString(2);
		   String sPhone = resultSet.getString(3);
		   String sCity  =  resultSet.getString(4);
		   
		   System.out.println("ID: "+sID+" "+"sName: "+sName+" "+"sPhone: "+sPhone+" "+"sCity: "+sCity+" ");
		   System.out.println("*******************************************");
	   }
	  
	   
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
	}

	public static void updateStudentInDB(int sID, String sName, String sPhone, String sCity) {
		
		Connection con = CP.create();
		String q = "update students set sname=?,sCity=? where sid=?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, sName);
			pstmt.setString(2, sCity);
			pstmt.setInt(3, sID);
			pstmt.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	   
		
	}
}
