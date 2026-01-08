package com.practice.constructor;

public class Movie {
	String movie;
	String hero;
	String heroine;
	double budget;
	
	Movie(){
		this("Bahubali");
		System.out.println("No arg constructor called !!");
	}
	
	Movie(String movie){
		this("Bahubali","Prabhas");
		System.out.println("One arg constructor called !!");
	}
	
	Movie(String movie, String hero){
		this("Bahubali","Prabhas","Anushka");
		System.out.println("Two arg constructor called !!");
	}
	
	Movie(String movie, String hero, String heroine){
		this("Bahubali","Prabhas","Anushka",250.00);
		System.out.println("Three arg constructor called !!");
	}
	
	Movie(String movie, String hero, String heroine, double budget){
		System.out.println("Four arg constructor called !!");
		this.movie=movie;
		this.hero=hero;
		this.heroine=heroine;
		this.budget=budget;
	}
	void display() {
		System.out.println("Movie name: " + movie);
		System.out.println("Movie hero: " + hero);
		System.out.println("Movie heroine: " + heroine);
		System.out.println("Movie budget: " + budget);
	}
	public static void main(String[] args) {
		System.out.println("Main method started !!");
		Movie m1=new Movie("RRR","NTR","Alia",750);
		m1.display();

	}

}
