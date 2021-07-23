import java.lang.*;
public class Book{
	private String bookId;
	private String bookTitle;
	private String authorName;
	private int publicationYear;
	private int availableQuantity;
	
	public Book(){
		
	}
	
	public Book (String bookId,String bookTitle,String authorName,int publicationYear,int availableQuantity){
		this.bookId=bookId;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.publicationYear=publicationYear;
		this.availableQuantity=availableQuantity;
		
		
			
		
	}
	public void showDetails(){
			System.out.println("BookId :"+bookId);
			System.out.println("Book Title :"+bookTitle);
			System.out.println("authorName :"+authorName);
			System.out.println("publicationYear"+publicationYear);
			System.out.println("availableQuantity"+availableQuantity);
	}
}