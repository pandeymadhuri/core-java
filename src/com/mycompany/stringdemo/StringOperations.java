package com.mycompany.stringdemo;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args){
		String s1 = "Madhuri Pandey";
		
		System.out.println("lenght is "+s1.length());
		System.out.println("Index of "+s1.indexOf("Pandey"));
		
		String s2 = "Madhuri";
		System.out.println(s2.substring(1,3));
		System.out.println(s2.substring(1,s2.length()-1));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("name is "+name);
		
		StringBuilder sb = new StringBuilder("apple");
		String s = sb.toString();
		System.out.println("SB "+sb);
		sb.append(" sharma");
		sb.insert(6, "kumar ");
		System.out.println("SB "+sb);
		//System.out.println(sb.reverse());
		System.out.println(sb.replace(2, 4, "kk"));
		System.out.println("added a line to check the commit");
		
	}
}
