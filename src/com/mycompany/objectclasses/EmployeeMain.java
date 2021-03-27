package com.mycompany.objectclasses;

public class EmployeeMain {

	public static void main(String[] arg){
		Employee emp1 = new Employee();
		emp1.setEmployeeId(1007517L);
		emp1.setSalay(900000);
		
		Employee emp2 = new Employee();
		emp2.setEmployeeId(600901);
		emp2.setSalay(8952478);
		
		System.out.println("Employee Id is "+emp1.getEmployeeId());
		System.out.println("Employee salary is "+emp1.getSalary());
		
		System.out.println("Employee Id is "+ emp2.getEmployeeId());
		System.out.println("Employee salary is "+emp1.getSalary());
	}
}
