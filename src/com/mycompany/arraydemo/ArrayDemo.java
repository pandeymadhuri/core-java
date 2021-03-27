package com.mycompany.arraydemo;

public class ArrayDemo {

	public static void main(String args[]){
		
		int arrOfAdhar[];
		arrOfAdhar =  new int[5];
		System.out.println(arrOfAdhar[3]);//output is zero cz default value if int is zero
		arrOfAdhar[3] = 5247895;
		for(int i = 0; i<arrOfAdhar.length; i++){
			System.out.println(arrOfAdhar[i]);
		}
		
		for(int a:arrOfAdhar){
			System.out.println("printing from enhanced for loop "+a);
		}
		
		boolean isEmployeeArr[];
		isEmployeeArr =  new boolean[2];
		System.out.println(isEmployeeArr[1]);
		isEmployeeArr[1] = true;
		//isEmployeeArr[8] = true;//run time exception indexout of bound
		for(int i = 0; i<isEmployeeArr.length; i++){
			System.out.println(isEmployeeArr[i]);
		}
	}
}
