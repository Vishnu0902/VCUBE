package com.practice.constructor;

class Person{
	int id;
	Person(){
		System.out.println("No arg parent class called!!!!");
	}
	
	Person(int id){
		System.out.println("One arg parent class called!!!!");
		this.id=id;
	}
}
public class Student1 extends Person {
//	int id;
//	String name;
	
	
	void Student1(int id){
//		super(101);
	}
	
	Student1(){
		super(33);
		System.out.println("No arg child class called !!!");
	}
	
	void show() {
		System.out.println("Student id: " +id);
//		System.out.println("Student name: " +name);
	}
	public static void main(String[] args) {
		Student1 s1= new Student1();
//		Student1 s2= new Student1(101);
		s1.show();
//		s2.show();
		
	}

}
