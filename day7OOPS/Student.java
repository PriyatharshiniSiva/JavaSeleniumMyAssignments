package day7OOPS;

public class Student {
	String strMsg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student objStdInfo=new Student();
	String strMessage=objStdInfo.getStudentInfo("849");
	String strMessage1=objStdInfo.getStudentInfo(98, "Tharini");
	objStdInfo.getStudentInfo("Tharini", "qwwe@gmail.com","994687977");
	System.out.println(strMessage);
	System.out.println(strMessage1);
	
	}
	public String getStudentInfo(String id)
	{
strMsg="Student ID is Created "+id;
	return strMsg;
	}
	public String getStudentInfo(int id,String name)
	{
		strMsg="";
strMsg="Student ID is "+id+ " and name is "+name;
return strMsg;
	}
	public void getStudentInfo(String name,String email,String PhoneNumber)
	{
		strMsg="";
strMsg="Student name is "+name+ " Email is "+email+ ", Phone number is "+PhoneNumber;
System.out.println(strMsg);
	}
}
