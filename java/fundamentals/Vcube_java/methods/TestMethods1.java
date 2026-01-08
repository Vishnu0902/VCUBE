package com.methods;

import java.util.Scanner;
public class TestMethods1 {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		TestMethods1 t1 = new TestMethods1();
		System.out.println("Enter A value: ");
		int A = sc.nextInt();
		System.out.println("Enter B value: ");
		int B = sc.nextInt();
		int Sum = add(A,B);
		System.out.println("Sum of A and B: " + Sum);
		
		int Sub = sub(add(A,B),B);
		System.out.println("Difference of A and B: " + Sub);
		
		int Mul = multiply(Sub,B);
		System.out.println("Product of A and B: " + Mul);
		
		int Div = division(Mul,B);
		System.out.println("Quotiant of A and B: " + Div);
		
		
		
		sc.close();
	}
	
	static int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	static int sub(int a, int b) {
		int diff = a-b;
		return diff;
	}
	
	static int multiply(int a, int b) {
		int mul = a * b;
		return mul;
	}
	
	static int division(int a, int b) {
		int div = a/b;
		modulus(div,b);
		
		return div;
	}
	
	static void  modulus(int a, int b) {
		int mod = a%b;
		System.out.println("Remainder of A and B: " + mod);
	}
	
	

}
