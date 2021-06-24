import java.lang.*;
public class StoryBook{
	String isbn;
	String bookTitle;
	String authorName;
	double price;
	int availableQuantity;
	String category;
	static double discountRate;
	
	public StoryBook(){
		
	}
	public StoryBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,String category){
		this.isbn=isbn;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.price=price;
		this.availableQuantity=availableQuantity;
		this.category=category;
		
	}
	public static void setDiscountRate(double rate){
		rate=rate;
		
	}
	public static double getDiscountRate(){
		return discountRate;
	}
	public void setIsbn(String isbn){
		this.isbn=isbn;
		
	}
	public void setBookTitle(String bookTitle){
		this.bookTitle=bookTitle;
	}
	public void setAuthorName(String authorName){
		this.authorName=authorName;
		
	}
	public void setPrice(double price){
		this.price=price;
		
	}
	public void setAvailableQuantity(int availableQuantity){
		
		this.availableQuantity=availableQuantity;
	}
	public void setCategory(String category){
		this.category=category;
		
	}
	
	public String getIsbn(){
		return isbn;
		
	}
	public String getBookTitle(){
		return bookTitle;
		
	}
	public String getAuthorName( ){
		return authorName;
	}
	public double getPrice( ){
		return price;
		
	}
	public void setAvailableQuantity( ){
		this.availableQuantity=availableQuantity;
		
	}
	public int getAvailableQuantity(){
		return availableQuantity;
	}
	public void setCategory(){
		this.category=category;
	}
	public String getCategory( ){
		return category;
	}
	public void addQuantity(int amount){
		
		this.availableQuantity=availableQuantity+amount;
		
	}
	public void sellQuantity(int amount){
		this.availableQuantity=availableQuantity-amount;
		
	}
	void showDetails(){
		System.out.println("isbn :"+isbn);
		System.out.println("BookTitle :"+bookTitle);
		System.out.println("AuthorName :"+authorName);
		System.out.println("Price :"+price);
		System.out.println("AvailableQuantity :"+availableQuantity);
		System.out.println("Category :"+category);
		System.out.println("DiscountRate :"+discountRate);
	}
	
}