package exam;
class Book{
	String title;
	String author;
	double price;
	
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	 void displayDetails() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
}
class EBook extends Book{
	double fileSizeMB;
	
	EBook(double fileSizeMB,String title,String author,double price){
		super(title,author,price);
		this.fileSizeMB=fileSizeMB;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("FileSize: "+fileSizeMB);
	}
}
class PrintedBook extends Book{
	int numberOfPages;
	
	PrintedBook(int numberOfPages,String title,String author,double price){
		super(title,author,price);
		this.numberOfPages=numberOfPages;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("number of pages: "+numberOfPages);
	}
}
public class BookInfo{
	public static void main(String [] args) {
		EBook book1=new EBook(78.5,"HarryPotter","J.K Roling",299.0);
		book1.displayDetails();
		PrintedBook book2=new PrintedBook(82,"Java Learning","James O M",549.50);
		book2.displayDetails();
	}
}