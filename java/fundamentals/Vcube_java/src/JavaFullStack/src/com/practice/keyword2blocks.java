package com.practice;

public class keyword2blocks {
	static {
		System.out.println("Static method started");
	}
	void instance() {
		System.out.println("Instance method started");
		
	}
	static {
		System.out.println("static method executed");
		System.out.println("static method ended");
		 
	}
	{
		System.out.println("instance  endd");
	}
	public static void main(String[] args) {
		
		

	}

}
