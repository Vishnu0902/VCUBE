package com.practice.constructor;

public class Student2 {
	int rollNo;
	String name;
	String branch;
	
	
	Student2(int rollNo, String name){
		System.out.println("Parameterized constructor called !!!");
		this.rollNo=rollNo;
		this.name=name;
		
	}
	
	Student2(Student2 S, String branch){
		System.out.println("***********************");
		System.out.println("Copy constructor called !!!");
		this.rollNo=S.rollNo;
		this.name=S.name;
		this.branch=branch;
		
	}
	
	void show() {
		System.out.println("Student RollNo : " + rollNo);
		System.out.println("Student Name: " + name);
		System.out.println("Student Branch: " + branch);
	}
	

	public static void main(String[] args) {
		System.out.println("Main method started !!!");
		Student2 s1= new Student2(33,"Vishnu");
		s1.show();
		
		Student2 s2= new Student2(s1,"ECE");
		s2.show();
		

	}

}
