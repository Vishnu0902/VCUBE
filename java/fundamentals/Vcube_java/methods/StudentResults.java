package com.methods;

import java.util.Scanner;

public class StudentResults {
//	int english;
//	int telugu;
//	int hindi;
//	int maths;
//	int social;
//	int science;
	
	void TotalMarks(int e, int t, int h, int m, int ss, int s ) {
		System.out.println("Total Marks:" );
		var t1 = e+t+h+m+ss+s;
		System.out.println(t1);
		
		
	}
	void avg(int TotalMarks) {
		System.out.println("Average Marks:");
//		var am = 
	}
	

	public static void main(String[] args) {
		System.out.println("Main method started");
		StudentResults s1 = new StudentResults();
//		s1.TotalMarks(85, 95, 90, 100, 95, 85);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter English Marks: ");
		int e = sc.nextInt();
		System.out.println("Enter Telugu Marks: ");
		int t = sc.nextInt();
		System.out.println("Enter Hindi Marks: ");
		int h = sc.nextInt();
		System.out.println("Enter Maths Marks: ");
		int m = sc.nextInt();
		System.out.println("Enter Social Marks: ");
		int ss = sc.nextInt();
		System.out.println("Enter Science Marks: ");
		int s = sc.nextInt();
		s1.TotalMarks(e, t, h, m, ss, s);
//		var t1 = e+t+h+m+ss+s;
//		s1.avg(TotalMarks);
		sc.close();
		
	}

}
