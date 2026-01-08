package com.practice;

public class keywords1 {
	byte numbers = 1;
	short rollnumber = 53;
	int age = 22;
	long phone = 8178443083l;
	float cgpa = 9.02f;
	double percentage = 85.05;
	char surname = 's';
	boolean islearningjfs= true;
	
	void Data() {
	      
		System.out.println(numbers);
		System.out.println(rollnumber);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(cgpa);
		System.out.println(percentage);
		System.out.println(surname);
		System.out.println(islearningjfs);
	}
	
	
	

	public static void main(String[] args) {
		keywords1 K1 = new keywords1();
		K1.Data();
		keywords1 K = new keywords1();
		K.age=20;
		K.numbers=2;
		K.rollnumber=54;
		K.phone=7993922913l;
		K.cgpa=9.05f;
		K.percentage=90;
		K.surname='A';
		K.Data();
	

		

	}

}
