package javalab;
import java.util.Scanner;
class Book{
	String title;
	String author;
	double price;
	int quantity;
	double total;
	
	Book(String title,String author,double price,int quantity){
		this.title=title;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
	}
	public void TotalCost() {
		total=price*quantity;
	}
	public void DisplayDetails() {
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
		System.out.println("Quantity"+quantity);
		System.out.println("Total Cost="+total);
	}
}

public class BookStore {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many book details:");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Enter the title of book "+(i+1));
			
			System.out.println("Enter the author of book "+(i+1));
		
			System.out.println("Enter the price of book "+(i+1));
			double d3=sc.nextInt();
			System.out.println("Enter the quantity of book "+(i+1));
			int d4=sc.nextInt();
			
		}
		
	}
}
