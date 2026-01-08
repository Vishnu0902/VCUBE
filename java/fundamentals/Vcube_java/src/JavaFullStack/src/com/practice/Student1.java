package com.practice;

public class Student1 {
	static int rollno;
	String Name;
	int marks;
	static int passout;

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		rollno=1;
		s1.Name="vishnu";
		s1.marks=98;
		passout=2019;
		
		System.out.println("Rollno:" +rollno);
		System.out.println("Name:" +s1.Name);
		System.out.println("Marks:" +s1.marks);
		System.out.println("Passout:" +passout);
		
		Student1 s2 = new Student1();
		rollno=rollno+1;
		s2.Name="vardhan";
		s2.marks=85;
		
		System.out.println("Rollno:" +rollno);
		System.out.println("Name:" +s2.Name);
		System.out.println("Marks:" +s2.marks);
		System.out.println("Passout:" +passout);
		

	}

}
