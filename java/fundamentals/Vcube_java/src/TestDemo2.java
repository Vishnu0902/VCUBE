package com.practice;

public class TestDemo2 {
	byte b;
	short s;
	int i;
	long L;
	float F;
	double d;
	char ch;
	boolean boo;

	public static void main(String[] args) {
		TestDemo2 t1 = new TestDemo2();
		System.out.println("byte:" +t1.b);
		System.out.println("short:" +t1.s);
		System.out.println("int:" +t1.i);
		System.out.println("long:" +t1.L);
		System.out.println("float:" +t1.F);
		System.out.println("double:" +t1.d);
		System.out.println("char:" +t1.ch);
		System.out.println("boolean:" +t1.boo);
		
		t1.b=127;
		t1.s=32767;
		t1.i=2147483637;
		t1.L=923377330758L;
		t1.F=33.3456789F;
		t1.d=123.456789123;
		t1.ch='T';
		t1.boo=true;
		
		System.out.println(t1.b);
		System.out.println(t1.s);
		System.out.println(t1.i);
		System.out.println(t1.L);
		System.out.println(t1.F);
		System.out.println(t1.d);
		System.out.println(t1.ch);
		System.out.println(t1.boo);
		
		

	}

}
