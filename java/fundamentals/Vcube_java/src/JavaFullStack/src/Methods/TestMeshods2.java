package Methods;

import java.util.Scanner;


public class TestMeshods2 {
	
	static Scanner sc= new Scanner(System.in);

	 public static void main(String[] args) {
		System.out.println("main method started");
//		TestMeshods2 s1 = new TestMeshods2();
		
		
		
		//Assigning and calling no return type+ with parameters..********************
		
//		System.out.println("Enter your First Name: ");
//		String fn = sc.next();
//		
//		System.out.println("Enter your Last Name: ");
//		String ln = sc.next();
//		s1.getname(fn,ln);
//		
//		System.out.println("Enter your Gender: ");
//		char G=sc.next().charAt(0);
//		s1.getGender(G);
//		
//		System.out.println("Enter your Age: ");
//		int age=sc.nextInt();
//		s1.getAge(age);
//		
//		System.out.println("Enter your Height: ");
//		float h=sc.nextFloat();
//		s1.getHeight(h);
//		
//		System.out.println("Enter your Birth Year: ");
//		int by=sc.nextInt();
//		s1.getbirthyear(by);
//		
//		System.out.println("Enter your Birth Month: ");
//		String bm = sc.next();
//		s1.getbirthmonth(bm);
//		
//		System.out.println("Enter your Birthday: ");
//		int bd=sc.nextInt();
//		s1.getbirthday(bd);
//		
//		System.out.println("Enter your Degree: ");
//		String D = sc.next();
//		s1.getDegree(D);
//		
//		System.out.println("Enter your Degree Branch: ");
//		String B = sc.next();
//		s1.getDegreeBranch(B);
//		
//		System.out.println("Enter your Degree Marks: ");
//		String M = sc.next();
//		s1.getDegreeMarks(M);
		
		//With return type + with parameters..*********************
		
//		System.out.println("Enter your Mother's Name: ");
//		String Mother = sc.next();
//		s1.getMothername(Mother);
//		
//		System.out.println("Enter your Mother's occupation: ");
//		String moccupation = sc.next();
//		s1.getMotheroccupation(moccupation);
//		
//		System.out.println("Enter your Father's Name: ");
//		String Father = sc.next();
//		s1.getFathername(Father);
//		
//		System.out.println("Enter your Father's occupation: ");
//		String foccupation = sc.next();
//		s1.getFatheroccupation(foccupation);
//		
//		System.out.println("Enter your Siblings: ");
//		int s = sc.nextInt();
//		s1.getsiblings(s);
//		
//		System.out.println("Enter your Sibling Name: ");
//		String sibling = sc.next();
//		s1.getSiblingname(sibling);
//		
//		System.out.println("Enter your Sibling Degree: ");
//		String sDegree = sc.next();
//		s1.getSiblingDegree(sDegree);
//		
//		System.out.println("Enter your Native Place: ");
//		String place = sc.next();
//		s1.getnativeplace(place);
//		
//		System.out.println("Enter your Native Place pincode: ");
//		int pin = sc.nextInt();
//		s1.getpincode(pin);
//		
//		System.out.println("Enter your Phone Number: ");
//		long Number = sc.nextLong();
//		s1.getNumber(Number);
		
		
		//with return type + no parameters..****************
		int mar = getSscMarks();
		System.out.println("SSC Marks:"+ mar);
		
		int Dmar = getDiplomaMarks();
		System.out.println("Diploma Marks:"+ Dmar);
		
		int Emar = getEngineeringMarks();
		System.out.println("Engineering Marks:"+ Emar);
		
//		int Summar = getSumOfMarks();
//		System.out.println("Sum of Marks:"+ Summar);
//		
//		int Avgmar = getAverageMarks();
//		System.out.println("Average Marks:"+ Avgmar);
//		
	}
	
	
	 //methods of no return type + with parameter..***********************
//	void getname(String fname, String lname) {
//		String fullname = fname+ " " + lname;
//		System.out.println("My Full name is:" +fullname);
//	}
//	
//	void getGender(char Gen) {
//		System.out.println("User's Gender  is :"+Gen);
//	}
//	
//	void getAge(int age) {
//		System.out.println("User's Age  is :"+age);
//	}
//	
//	void getHeight(float h) {
//		System.out.println("User's height  is :"+h);
//	}
//	
//	void getbirthyear(int by) {
//		System.out.println("User's Birth Year  is :"+by);
//	}
//	
//	void getbirthmonth(String bm) {
//		System.out.println("User's Birth Month  is :"+bm);
//	}
//	
//	void getbirthday(int bd) {
//		System.out.println("User's Birthday  is :"+bd);
//	}
//	
//	void getDegree(String D) {
//		System.out.println("User's Degree  is :"+D);
//	}
//	
//	void getDegreeBranch(String B) {
//		System.out.println("User's Degree Branch  is :"+B);
//	}
//	
//	void getDegreeMarks(String M) {
//		System.out.println("User's Degree Branch  is :"+M);
//	}
//	
	
	// with return type + With parameters...***************************
//	String getMothername(String Mother) {
//		System.out.println("User's Mother Name is:" + Mother);
//		return Mother;
//	}
//	
//	String getMotheroccupation(String moccupation) {
//		System.out.println("User's Mother occupation is:" + moccupation);
//		return moccupation;
//	}
//	
//	String getFathername(String Father) {
//		System.out.println("User's Father Name is:" + Father);
//		return Father;
//	}
//	
//	String getFatheroccupation(String foccupation) {
//		System.out.println("User's Father occupation is:" + foccupation);
//		return foccupation;
//	}
//	
//	int getsiblings(int s) {
//		System.out.println("User's siblings:" + s);
//		return s;
//	}
//	
//	String getSiblingname(String Sibling) {
//		System.out.println("User's Sibling Name is:" + Sibling);
//		return Sibling;
//	}
//	
//	String getSiblingDegree(String SDegree) {
//		System.out.println("User's Sibling Degree is:" + SDegree);
//		return SDegree;
//	}
//	String getnativeplace(String place) {
//		System.out.println("User's Native Place is:" + place);
//		return place;
//	}
//	
//	int getpincode(int pin) {
//		System.out.println("User's Native Place pincode  is:" + pin);
//		return pin;
//	}
//	
//	long getNumber(long Number) {
//		System.out.println("User's Phone Number  is:" + Number);
//		return Number;
//	}
	
	//wirth return type+ No parameters..**********************
	static int getSscMarks() {
		System.out.println("User's SSC Marks:" );
		int Marks = sc.nextInt();
		return Marks;
	}
	
	static int getDiplomaMarks() {
		System.out.println("User's Diploma Marks:" );
		int DMarks = sc.nextInt();
		return DMarks;
	}
	
	static int getEngineeringMarks() {
		System.out.println("User's Engineering Marks:" );
		int EMarks = sc.nextInt();
		return EMarks;
	}
	
//	static int getSumOfMarks() {
//		System.out.println("User's Sum Of Marks:" );
//		int SumMarks = sc.nextInt();
//		return SumMarks;
//	}
//	
//	static int getAverageMarks() {
//		System.out.println("User's Average Marks:" );
//		int AvgMarks = sc.nextInt();
//		return AvgMarks;
//	}
	
}
