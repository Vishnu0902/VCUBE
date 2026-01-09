package com.practice.constructor;


class Vehicle{
	String registrationNumber;
	double price;
	
	
	public Vehicle(String registrationNumber, double price) {
		System.out.println("Parameterized constructor called from Vehicle Class!!!");
		this.registrationNumber = registrationNumber;
		this.price = price;
	}
	Vehicle(Vehicle v1){
		this.price=v1.price;
		this.registrationNumber=v1.registrationNumber;
	}
	
	
	
}
public class Car extends Vehicle {
	String model;
	String ownerName;
	
	
	Car(String model, String ownerName){
		super("23681935181",1500000.00);
		System.out.println("Parameterized constructor called from Car class !!!");
		this.model=model;
		this.ownerName=ownerName;
		
	}
	
	Car( Car c1){
		
		super(c1);
		System.out.println("Copy Construtor called !!!");
		this.model=c1.model;
		this.ownerName=c1.ownerName;
	}
	
	
	void show() {
		System.out.println("Car Model: " + model);
		System.out.println("Car Registration Number: " + registrationNumber);
		System.out.println("Car Price: " + price);
		System.out.println("Car Owner Name: " + ownerName);
		
	}

	public static void main(String[] args) {
		System.out.println("Main method started !!!");
		Car C1=new Car( "KIA", "Vishnu");
		C1.show();
		Car C2= new Car(C1);
		C2.show();
		

	}

}
