package com.operators;

import java.util.Scanner;

public class Demo1 {
	 
	static int a;
	 static int b;
	
	
	
	
	static void Addition() {
		System.out.println("Addition method performed !!!");
		System.out.println(a+b);
	}
	
	static void Multiplication() {
		System.out.println("Multiplication method performed !!!");
		System.out.println(a*b);
	}
	
	void Subtraction() {
		Demo1.Addition();
		System.out.println("Subtraction method performed !!!");
		System.out.println(a-b);
	}
	
	void Division() {
		Demo1.Multiplication();
		System.out.println("Division method performed !!!");
		System.out.println(a/b);
	}
	


	public static void main(String[] args) {
		System.out.println("Main method started !!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a=sc.nextInt();
		
		System.out.println("Enter Second number:");
		b=sc.nextInt();
		
		
		Demo1 d1 = new Demo1();
		d1.Subtraction();
		d1.Division();
		 
		
		sc.close();

	}

}
