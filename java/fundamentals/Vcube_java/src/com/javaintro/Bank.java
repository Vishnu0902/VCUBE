package com.javaintro;

public class Bank {
	static long Ac = 12301;
	String HolderName;
	double Balance;
	
	void Display(){
		System.out.println(Ac);
		System.out.println(HolderName);
		System.out.println(Balance);
		
	}

	public static void main(String[] args) {
		Bank emp1 = new Bank();
		emp1.HolderName = "Vishnu";
		emp1.Balance = 15000;
		emp1.Display();
		Bank emp2 = new Bank();
		emp2.HolderName = "Vardhan";
		emp2.Balance = 10000;
		Ac =Ac+1;
		emp2.Display();
		Bank emp3 = new Bank();
		emp3.HolderName = "Reddy";
		emp3.Balance = 24000;
		Ac=Ac+1;
		emp3.Display();

	}

}
