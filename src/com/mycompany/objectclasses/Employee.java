package com.mycompany.objectclasses;

public class Employee {
	
	long employeeId;
	double salary;
	
	void setEmployeeId(long eId){
		employeeId = eId;
	}

	void setSalay(double s){
		salary = s;
	}
	
	long getEmployeeId(){
		return employeeId;
	}
	
	double getSalary(){
		return salary;
	}
}
