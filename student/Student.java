package student;

import department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		Student objStu=new Student();
		objStu.collegeName();
		objStu.collegeCode();
		objStu.collegeRank();
		objStu.deptName();
		objStu.studentName();
		objStu.studentDept();
		objStu.studentId();
		

	}
	public void studentName()
	{
	System.out.println("Call from Child:StudentName is Tharani");
	}
	public void studentDept()
	{
	System.out.println("Call from Child:StudentDept is CSE");
	}
	public void studentId()
	{
	System.out.println("Call from Child:StudentID is R984367");
	}

}
