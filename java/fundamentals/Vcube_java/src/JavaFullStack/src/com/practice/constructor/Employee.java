package com.practice.constructor;

//constructor chaining in increasing order.
public class Employee {
	int eid;
	String ename;
	String branch;
	double salary;

	Employee() {
		System.out.println("No arg constructor Called!!");
		eid = 101;
		ename = "vishnu";
		branch = "Addanki";
		salary = 125000;
	}

	Employee(int eid) {
		this();
		System.out.println("one arg consturctor called");
		this.eid = eid;
	}

	Employee(int eid, String ename) {
		this(eid);
		System.out.println("two arg consturctor called");
		this.ename = ename;
	}

	Employee(int eid, String ename, String branch) {
		this(eid, ename);
		System.out.println("three arg consturctor called");
		this.branch = branch;
	}

	Employee(int eid, String ename, String branch, double salary) {
		this(eid, ename, branch);
		System.out.println("four arg consturctor called");
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println("Main method Started!!");
		Employee e1 = new Employee();
		e1.display();

		Employee e2 = new Employee(102);
		e2.display();

		Employee e3 = new Employee(103, "vardhan");
		e3.display();

		Employee e4 = new Employee(104, "Reddy", "Darsi");
		e4.display();

		Employee e5 = new Employee(105, "Veera", "podili", 100000);
		e5.display();

		System.out.println("Main method Ended!!");
	}

	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(branch);
		System.out.println(salary);

	}

}
