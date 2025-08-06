package javalab;
class Books{
	String title;
	String author;
	final int bookId;
	static int book_counter=1000;
	static final String library_name="Central Library";
	
	Books(){
		this.bookId = book_counter++;
		title="nill";
		author="author";
	}
	Books(String title,String author){
		this.title=title;
		this.author=author;
		this.bookId = book_counter++;
		
	}
	public void displayInfo() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Book id:"+bookId);
	}
	public void displayInfo(boolean showLibrary) {
		if(showLibrary==true) {
			displayInfo();
			System.out.println("Library Name: "+library_name);
		}
	}
	public void displayTotalBooks() {
		System.out.println("Total Books added: "+(book_counter-1000));
	}
}

public class BookInfo {

	public static void main(String[] args) {
		Books book=new Books();
		book.displayInfo(true);
		book.displayInfo();

	}

}
