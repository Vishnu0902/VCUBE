package com.practice;

public class Vishnu {
	
	int n;
	String name;
	
	 void Vishnu(int n, String name){
		System.out.println("No arg constructor called !!!");
		this.n=n;
		this.name=name;
	}
	void show() {
		System.out.println(n);
		System.out.println(name);
	}

	public static void main(String[] args) {
		System.out.println("Main method Started !!!");
		Vishnu s1=new Vishnu();
		s1.Vishnu(0, null);
		s1.show();

	}

}
