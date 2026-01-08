package com.practice.constructor;

public class Student {
	int id;
	String name;
	String branch;
	int marks;
	
	Student(int id, String name, String branch, int marks){
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
	}
	

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		Student s1 = new Student(101,"Vishnu","ECE",85);
		s1.display();
		
		System.out.println("***************");
		Student s2 = new Student(102,"Vardhan","CSE",98);
		s2.display();
		System.out.println("Main Method Ended!!");
	}
	void display() {
		System.out.println("Student ID :" + id);
		System.out.println("Student Name :" + name);
		System.out.println("Student Branch :" + branch);
		System.out.println("Student Marks :" + marks);
		
	}

}
