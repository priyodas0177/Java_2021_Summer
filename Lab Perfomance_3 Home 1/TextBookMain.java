public class TextBookMain{
	public static void main(String [] args){
		TextBook t1=new TextBook("bd13456","Chemisttry","siam",550,12,14);
		t1.showDetails();
		
		TextBook t2=new TextBook();
		t2.setIsbn("wh8790548");
		t2.setBookTitle("Math");
		t2.setAuthorName("Mostak");
		t2.setPrice(908);
		t2.setAvailableQuantity(6);
		t2.setStandard(16);
		
		System.out.println(t2.getIsbn());
		System.out.println(t2.getBookTitle());
		System.out.println(t2.getAuthorName());
		System.out.println(t2.getPrice());
		System.out.println(t2.getAvailableQuantity());
		System.out.println(t2.getStandard());
	}
}