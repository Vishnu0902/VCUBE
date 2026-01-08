package com.practice;

public class Demo1 {
	static String Name="Vishnu";
	int id=53;
	
	static void Info() {
		System.out.println(Name);
	}
	{
		System.out.println(id);
		Info();
		Demo1 d = new Demo1();
		d.id=53;
		System.out.println(d.id);
	}

	public static void main(String[] args) {
		Demo1 d1 = new Demo1(); 
		d1.id=523;
	}

}
