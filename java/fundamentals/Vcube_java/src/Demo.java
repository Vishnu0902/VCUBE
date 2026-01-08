package com.practice;

public class Demo {
	static String Name;
	int id;
	static {
		System.out.println("static:"+ Name);
	}
	{
		System.out.println("Instance:"+ id);
	}
	static void studentInfo() {
		Name = "Vishnu";
		System.out.println("Name:"+ Name);
		
	}
	void details() {
//		Demo i1 = new Demo();
//		i1.id = 33;
//		System.out.println(i1.id);
		System.out.println("id:"+ id);
		
	}

	public static void main(String[] args) {
		Demo i2 = new Demo();
		i2.id=53;
		studentInfo();
		i2.details();
		

	}

}
