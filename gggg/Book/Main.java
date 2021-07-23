public class Main{
	public static void main (String args []){
		Book b1=new Book ("15120","math","siam",2000,10);
		Book b2=new Book ("12712","math","siam",2000,20);
		Book b3=new Book ("15110","math","siam",2000,100);
		Book b4=new Book ("24120","math","siam",2000,200);
		Book b5=new Book ("241206","math","siam",2000,200);
		
		Library l1=new Library ("open Library","dinajpur",10);
		
		l1.addBook(b1);
		l1.addBook(b2);
		l1.addBook(b3);
		l1.addBook(b4);
		
		l1.showDetails();
		l1.removeBook(b1);
		System.out.println("Number of books :"+l1.countTotalBooksIntheLibrary());
		l1.addBook(b5);
		l1.showDetails();
		System.out.println("Number of books :"+l1.countTotalBooksIntheLibrary());
		
		
	}
}