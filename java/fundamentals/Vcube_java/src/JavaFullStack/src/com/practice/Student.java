package com.practice;

public class Student {
	 int id;
	 String Name;
	 long phoneno;
//	 static int id;
//	 static String Name;
//	 static long phoneno;
	void studentInfo(){
		System.out.println("Id: "+ id );
		System.out.println("Name: "+ Name);
		System.out.println("PhoneNo: "+ phoneno);
			
	}
	static void Vishnu() {
		Student V = new Student();
		V.id= 53;
		V.Name = "Vishnu Vardhan Reddy";
		V.phoneno = 8178443083l;
		V.studentInfo();
	}
	
	public static void main(String[] args) {
//		Student v = new Student();
//		v.id = 53;
		Vishnu();
//		System.out.println("Id: "+ v.id );
//		System.out.println("Name: "+ Name);
//		System.out.println("PhoneNo: "+ phoneno);
	}

}
