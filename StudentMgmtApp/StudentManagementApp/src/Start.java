
import java.util.*;

import com.student.manage.Student;
import com.student.manage.StudentDAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
	

public class Start {

	public static void main(String[] args) throws IOException{
    
		int choice=0;
		
		System.out.println("Welcome to Student Mgmt App");
		
		while(true)
		{
		System.out.println("Enter 1 to add Student");
		System.out.println("Enter 2 to delete Student");
		System.out.println("Enter 3 to display Student");
		System.out.println("Enter 4 to update an entry");
		System.out.println("Enter 5 to delete an entry");
		System.out.println("Enter 6 to drop table");
		System.out.println("Enter 7 to exit");
		
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    try
	    {
	    	choice = Integer.parseInt(br.readLine());
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
		
	    if(choice ==0 || choice >6)
	    {
	    	System.out.println("Wrong entry");
	    }
	    
	    else 
	    {
	    switch(choice)
	    {
     
	    case 1: 			// add Student
			
	    	System.out.println("Enter Student ID ");
			int id = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Student Name ");
			String name = br.readLine();
			
			System.out.println("Enter Student Phone ");
			String phone = br.readLine();
			
			System.out.println("Enter Student City ");
			String city = br.readLine();
			
			Student st = new Student(id,name,phone,city);
           boolean responseAdd = StudentDAO.insertStudentToDB(st);
            if(responseAdd == true)
            {
    			System.out.println("Student added successfully ");

            }
            else
            {
    			System.out.println("Student not added successfully  ");

            }
			
	    	break;
	    	
	    case 2:   						//Delete Student
	    	
			System.out.println("Enter Student Id to delete Student");
			int userId=Integer.parseInt(br.readLine());
			boolean responseDelete =  StudentDAO.deleteStudentFromDB(userId);
			
			if(responseDelete == true)
            {
    			System.out.println("Student deleted successfully ");

            }
            else
            {
    			System.out.println("Student not deleted successfully  ");
            }
	    	
	    	
	    	break;
	    	
	    case 3:
	    	
	    	System.out.println("PLEASE WAIT..");
			
			StudentDAO.displayStudentData();
			
	    	break;
	    	
	    case 4:
	    	
	    	System.out.println("Enter the details for record update");
	    	System.out.println("Enter the sId for record update");
	    	int sID= Integer.parseInt(br.readLine());
	    	if(sID == 0)
	    	{
	    		break;
		    	
	    	}
	    	else
	    	{
	    		System.out.println("Enter the fields to update for sID: "+sID);
	    		
	    		System.out.println("Enter sName for sID: "+sID);
	    		String sName  =  br.readLine();
	    		
	    		System.out.println("Enter sPhone for sID: "+sID);
	    		String sPhone =  br.readLine();
	    		
	    		System.out.println("Enter sCity for sID: "+sID);
	  		    String sCity  =  br.readLine();
	  		    
	  		    
	  		  StudentDAO.updateStudentInDB( sID,  sName,  sPhone,  sCity);
		    	
	         System.out.println("PLEASE WAIT..");
			 StudentDAO.displayStudentData();
	    	
	    	}
	    	
	    	
	    	break;
	    	
	    case 5:
	    	break;
	    	
	    case 6:
	    	break;
	    case 7:
	    	break;
	    	 	
	    default:
	    	break;
	    	
	    		
	    }
	    }
		
		}
		
	
	
	}

}
