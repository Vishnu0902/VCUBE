package com.practice.constructor;

public class Cricketer {
	 String name;
	int jno;
	String country;
	int centuries;

	Cricketer(String name, int jno, String country, int centuries) {
		System.out.println("Four arg constructor called");
		this.name = name;
		this.jno = jno;
		this.country = country;
		this.centuries = centuries;
	}

	Cricketer(String name, int jno, String country) {
		this("Rohit", 45, "india", 55);
		System.out.println("three arg constructor called");
	}

	Cricketer(String name, int jno) {
		this("Rohit", 45, "india");
		System.out.println("two arg constructor called");

	}

	Cricketer(String name) {
		this("Rohit", 45);

		System.out.println("one arg constructor called");
	}

	Cricketer() {
		this("Rohit");

		// Cannot refer to an instance field name while explicitly invoking a
		// constructor
		System.out.println("No arg constructor called");
		name = "vishnu";
		jno = 9;
		country = "india";
		centuries = 1;
	}

	void show() {
		System.out.println(name);
		System.out.println(jno);
		System.out.println(country);
		System.out.println(centuries);
	}

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		Cricketer c1 = new Cricketer();
		c1.show();
		Cricketer c2 = new Cricketer("rohit", 45, "india", 55);
		c2.show();
//		Cricketer c3 = new Cricketer("virat", 18, "india");
//		c3.show();
//		Cricketer c4 = new Cricketer("dhoni", 7);
//		c4.show();
//		Cricketer c5 = new Cricketer("sky");
//		c5.show();
	}

}
