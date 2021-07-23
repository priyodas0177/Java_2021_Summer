public class Main {
	public static void main (String [] args){
		Shop s1=new Shop ("Priyo enterprise","Parbatipur",2,3);
		RegularCustomer r1=new RegularCustomer("2715150");
		Customer c1=new Customer ("mostak","2155145");
		
		s1.insertCustomer(c1);
		s1.insertRegularCustomer(r1);
		
		System.out.println("Shop Name :"+s1.getShopName());
		System.out.println("Location :"+s1.getLocation());
		s1.showRegularCustomerDetails();
		s1.showCustomerDetails();
	}
}