public class Library{
	String libraryName;
	String location;
	Book[] books;
	
	public Library (){
		
	}
	public Library (String libraryName,String location,int sizeOfArray){
		this.libraryName=libraryName;
		this.location=location;
		this.books=new Book [sizeOfArray];
	}
	public void showDetails(){
		System.out.println("library name :"+libraryName);
		System.out.println("location :"+location);
		
	}
	public void addBook(Book b){
		
		for(int i=0;i<books.length;i++){
			if (books [i]==null){
				books [i]=b;
				break;
			}
		}
	}
	public void removeBook(Book b){
		
		for(int i=0;i<books.length;i++){
			if (books [i]==b){
				books [i]=null;
				break;
			}
		}
	}
	public int countTotalBooksIntheLibrary(){
		int length= 0;
		for(int i=0;i<books.length;i++){
			if (books [i]!=null){
				length++;
			}
		}
		return length;
	}
}	