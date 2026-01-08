package com.practice;

public class Sample {
	static long L;
	int i;
	
	static void spdt() {
		L = 8178443083l;
		System.out.println(L);
	}
	
	void pdt() {
		Sample s = new Sample();
		s.i=53;
		Sample.spdt();
		System.out.println(s.i);	
	}

	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.pdt();
	}

}
