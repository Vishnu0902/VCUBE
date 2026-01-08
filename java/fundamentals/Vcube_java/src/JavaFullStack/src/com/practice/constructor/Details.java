package com.practice.constructor;


class Book{
	String bookname;
	int  price;
	
	Book(String bookname, int price){
		System.out.println("parameterized constructor called from Book class !!!");
		this.bookname=bookname;
		this.price=price;
		
	}
}

class Author extends Book{
	String authorname;
	String authorplace;
	
	Author(String bookname, int price, String authorname, String authorplace){
		super(bookname, price);
		System.out.println("parameterized constructor called from Author class !!!");
		this.authorname=authorname;
		this.authorplace=authorplace;
	}
	void show(){
		System.out.println("Book name: " + bookname);
		System.out.println("Book price: " + price);
		System.out.println("Book author: " + authorname);
		System.out.println("Book authorplace: " + authorplace);
	}
	
}
public class Details {

	public static void main(String[] args) {
		System.out.println("Main method started !!!");
		Author a1= new Author("Right Guy",199,"Vishnu", "Darsi");
		a1.show();

	}

}
