package com.introduction1;

public class Employee {
   
	//Declaration 
	static String companyName;
	
	int eId;
	String eNAme;
	String departmentName;
	int empSalary;
	

	public static void main(String[] args) {
     
	//Initialization
	 companyName = "TCS";
	 
     Employee e1 = new Employee();
     
     e1.eId = 101;
 	 e1.eNAme = "sneha";
 	 e1.departmentName = "healthcare";
 	 e1.empSalary = 50000;
     
 	 //Accessing Data
 	 System.out.println("Object 1-----------------------------");
     System.out.println("companyName: " + companyName);
     System.out.println("empId: " + e1.eId);
     System.out.println("empName: " + e1.eNAme);
     System.out.println("department: " + e1.departmentName);
     System.out.println("Salary: " + e1.empSalary);
      
     
    Employee e2 = new Employee();
     
     e2.eId = 102;
 	 e2.eNAme = "lisa";
 	 e2.departmentName = "IT";
 	 e2.empSalary = 70000;
     
 	System.out.println("Object 2-----------------------------");
    System.out.println("companyName: " + companyName);
    System.out.println("empId: " + e2.eId);
    System.out.println("empName: " + e2.eNAme);
    System.out.println("department: " + e2.departmentName);
    System.out.println("Salary: " + e2.empSalary);
     
    companyName = "wipro";

    Employee e3 = new Employee();
     
     e3.eId = 103;
 	 e3.eNAme = "siya";
 	 e3.departmentName = "product";
 	 e3.empSalary = 60000;
     
 	System.out.println("Object 3-----------------------------");
    System.out.println("companyName: " + companyName);
    System.out.println("empId: " + e3.eId);
    System.out.println("empName: " + e3.eNAme);
    System.out.println("department: " + e3.departmentName);
    System.out.println("Salary: " + e3.empSalary);

	}

}
