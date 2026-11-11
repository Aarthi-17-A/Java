package com.introduction1;

public class StudentCollege {

	 static String collegeName;
	 static String principalName;
	   
	 int studentId;
	 String studentName;
	 String courseName;
	 int marks;
	 
	  void displayStudentDetails(){				  
		 System.out.println("Student Details------------------------");
		 System.out.println("StudentId: " + studentId);
		 System.out.println("StudentName: " + studentName);
		 System.out.println("CourseName: " + courseName);
		 System.out.println("Marks: " + marks);
	  }
	 
	 static void displayCollegeDetails(){
		  System.out.println("College Details------------------------");
		  System.out.println("CollegeName: " + collegeName);
		  System.out.println("PrincipalName: " + principalName);
	  }
	 
	 static void changePrincipal(){
		  System.out.println("Changed Principal Name-------------------");
		  System.out.println("ChangedPrincipalName: " + principalName);
	  }
	 
	 
	public static void main(String[] args) {
	    
		
		StudentCollege s1 = new StudentCollege();
		s1.studentId = 101;
		s1.studentName = "aarthi";
		s1.courseName = "java full stack";
	    s1.marks = 100;
		s1.displayStudentDetails();
//		
//
		s1.studentId = 102;
		s1.studentName = "priya";
		s1.courseName = "Python";
		s1.marks = 90;
    	s1.displayStudentDetails();
		
		
		collegeName = "Tapasya college";
		principalName = "Suresh";
		displayCollegeDetails();
		
		
		principalName = "Ramesh";
		changePrincipal();
		
	}

}





