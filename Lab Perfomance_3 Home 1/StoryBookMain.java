public class StoryBookMain{
	public static void main (String args []){
		StoryBook s1=new StoryBook("bd123456","Physics","Priyo",550,12,"educational");
		
		s1.showDetails();
		
		StoryBook s2=new StoryBook();
		s2.setIsbn("mt12378");
		s2.setBookTitle("Math");
		s2.setAuthorName("Horish");
		s2.setPrice(720);
		s2.setAvailableQuantity(15);
		s2.setCategory("Education");
		System.out.println(s2.getIsbn());
		System.out.println(s2.getBookTitle());
		System.out.println(s2.getAuthorName());
		System.out.println(s2.getPrice());
		System.out.println(s2.getAvailableQuantity());
		System.out.println(s2.getCategory());
		
	}
}