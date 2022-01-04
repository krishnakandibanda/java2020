package com.constructor;

public class ParameterizedConstructor {

	int empId;
	String empName;
	
	ParameterizedConstructor(int id,String name){
		this.empId=id;
		this.empName=name;		
	}
	void infoEmp() {
		System.out.println("Employee id is "+empId+" This ");
		System.out.println("Employee name is  "+empName+" This");
	}
	
	public static void main(String[] args) {
		
		ParameterizedConstructor pc=new ParameterizedConstructor(10,"Krishna");
		ParameterizedConstructor pc1=new ParameterizedConstructor(11,"Srinivasa");
		
		pc.infoEmp();
		pc1.infoEmp();
	}

}
