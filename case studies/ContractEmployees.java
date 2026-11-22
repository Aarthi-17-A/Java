package com.casestudies;

class PermanentEmployees{
	int empId;
	String empName;
	String dName;
	double salary;
	
	public PermanentEmployees(int empId, String empName, String dName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.dName = dName;
		this.salary = salary;
	}
	
	
	void permanentDetails() {
		System.out.println("---------------------------------------------");
		System.out.println("Employee ID is :" + empId);
		System.out.println("Employee Name is :" + empName);
		System.out.println("Employee Department Name is :" + dName);
		System.out.println("Employee Salary is :" + salary);
	}
	
}

public class ContractEmployees extends PermanentEmployees{
  String contractDuration;
  
	 ContractEmployees(){
		this(101);
	}
	 
	 ContractEmployees(int empId){
			this(empId,"aarthi");
	}
	 
	ContractEmployees(int empId,String empName){
			this(empId,empName,"Product");
	}
	
	ContractEmployees(int empId,String empName,String dName){
		this(empId,empName,dName,30000.00);
   }

	ContractEmployees(int empId,String empName,String dName,double salary){
		this(empId,empName,dName,salary,"6 months");
   }
	
    ContractEmployees(int empId, String empName, String dName, double salary,String contractDuration){
		super(empId,empName,dName,salary);
		this.contractDuration = contractDuration;
    }
    
    void  contractDetails() {
    	System.out.println("---------------------------------------------");
        System.out.println("Contract employees");
    	permanentDetails();
    	System.out.println("Employee Contract Duration is :" + contractDuration);
	}
    
	public static void main(String[] args) {
		
		ContractEmployees c1 = new ContractEmployees();
		c1.permanentDetails();
		
		
		ContractEmployees c2 = new ContractEmployees(102,"siya","sales",20000.00);
	    c2.contractDetails();
			
	}

}
