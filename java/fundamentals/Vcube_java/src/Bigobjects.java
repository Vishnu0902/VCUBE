package com.practice;

import java.math.BigInteger;
import java.math.BigDecimal;
public class Bigobjects {
//	BigInteger bi1=new BigInteger("123456789987654321");
//	BigDecimal bd1 = new BigDecimal("123456789987654321.123456789987654321");
//	
	BigInteger bi1;
	BigInteger bi2;
	BigDecimal bd1;
	BigDecimal bd2;

	
	public static void main(String[] args) {
		Bigobjects t1=new Bigobjects();
		System.out.println("main method started");
		
		System.out.println("BigInteger:"+ t1.bi1);
		System.out.println("BigDecimal:"+ t1.bd1);
		//Assigning the values.
		t1.bi1 = new BigInteger("123456789987654321");
		t1.bi2 = new BigInteger("123456789987654321");
		t1.bd1 = new BigDecimal("123456789987654321.123456789987654321");
		t1.bd2 = new BigDecimal("123456789987654321.123456789987654321");
		//printing the values after assigning.
		System.out.println("BigInteger:"+ t1.bi1);
		System.out.println("BigDecimal:"+ t1.bd1);
		
		//Addition
		System.out.println("*******Addition*******");
		System.out.println("BigInteger:"+ t1.bi1.add(t1.bi2));
		System.out.println("BigDecimal:"+ t1.bd1.add(t1.bd2));
		
		//Subtraction
		System.out.println("*******Subtraction*******");
		System.out.println("BigInteger:"+ t1.bi1.subtract(t1.bi2));
		System.out.println("BigDecimal:"+ t1.bd1.subtract(t1.bd2));
		
		//Multiplication
		System.out.println("*******Multiplication*******");
		System.out.println("BigInteger:"+ t1.bi1.multiply(t1.bi2));
		System.out.println("BigDecimal:"+ t1.bd1.multiply(t1.bd2));
		
		//Division
		System.out.println("*******Division*******");
		System.out.println("BigInteger:"+ t1.bi1.divide(t1.bi2));
		System.out.println("BigDecimal:"+ t1.bd1.divide(t1.bd2));
		
		//Modulus
		System.out.println("*******Modulus*******");
		System.out.println("BigInteger:"+ t1.bi1.mod(t1.bi2));
		System.out.println("BigDecimal:"+ t1.bd1.remainder(t1.bd2));
		
		//Divide and Remainder
		System.out.println("*******Divide And Remainder*******");
		System.out.println("BigInteger:"+ t1.bi1.divideAndRemainder(t1.bi2));
		System.out.println("BigDecimal:"+ t1.bd1.divideAndRemainder(t1.bd2));
         		
//		//Value of
//		System.out.println("*******Value of*******");
//		System.out.println("BigInteger:"+ t1.bi1.valueOf(t1.bi2));
//		System.out.println("BigDecimal:"+ t1.bd1.valueOf(t1.bd2));
//	
		
	}

}
