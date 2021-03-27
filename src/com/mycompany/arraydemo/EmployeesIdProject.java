package com.mycompany.arraydemo;

import java.util.Scanner;

public class EmployeesIdProject {
	
	public static void main(String[] arg){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		System.out.println(age);
		System.out.println("Hi Manager, Please enter the number of employees in your company");
		int empNo = scanner.nextInt();
		int[] arrEmp = new int[empNo];
		
		
		for(int i=0; i<arrEmp.length; i++){
			System.out.println("Enter employee id of "+(i+1)+" employee");
			arrEmp[i] = scanner.nextInt();
		}
		
		for(int i=0; i<arrEmp.length; i++){
			System.out.println("Employee id of employee "+(i+1)+" is "+arrEmp[i]);
		}
	}

}
