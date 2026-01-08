package com.practice.constructor;

class Animal{
	
	int id;
	String name;
	
	
	Animal(){
		System.out.println("No arg constructor from Animal");
	}
	
	Animal(int id){
		System.out.println("one arg constructor from Animal");
		this.id=id;
	}
	Animal(int id, String name){
		System.out.println("two arg constructor from Animal");
		this.id=id;
		this.name=name;
		
	}
	
	void show() {
		System.out.println("From parent class: " + id);
		System.out.println("From parent class: " + name);
	}
	public static void main(String args[]) {
		System.out.println("Main method started from Animal  !!");
	}
	
}
public class Dog extends Animal {
	
	int id;
	String name;
	Dog(){
		super(101,"puppy");
		System.out.println("no arg constructor calld from Dog !!");
		
	}
	Dog(int id){
		this();
		this.id=id;
		System.out.println("One arg constructor calld from Dog !!");
		
	}
	Dog(int id, String name){
		this(id);
		this.name=name;
//		super(101,"puppy");
		System.out.println("two arg constructor from Dog");
	}
	
	void display() {
		System.out.println("From child class: " + id);
		System.out.println("From child class: " + name);
	}

	public static void main(String[] args) {
		System.out.println("main method started from Dog  !!");
		Dog d1 = new Dog(102,"cutie");
		
		d1.show();
		d1.display();
	}

}
