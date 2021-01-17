package com.student.manage;

public class Student {
 	
 private int StudentID;
 private String studentName;
 private String studentPhone;
 private String studentCity;
 
 public Student(int studentID, String studentName, String studentPhone, String studentCity) {
		super();
		StudentID = studentID;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	 
 
 	
public int getStudentID() {
	return StudentID;
}
public void setStudentID(int studentID) {
	StudentID = studentID;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentPhone() {	
	return studentPhone;
}
public void setStudentPhone(String studentPhone) {
	this.studentPhone = studentPhone;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}



@Override
public String toString() {
	return "Student [StudentID=" + StudentID + ", studentName=" + studentName + ", studentPhone=" + studentPhone
			+ ", studentCity=" + studentCity + "]";
}

 
 

}
