public class Main {
	public static void main (String [] args){
		Customer c1=new Customer ("priyo","67834");
		Account a1=new Account ("mostak","0544","pbt");
		c1.setAccount(a1);
		System.out.println("Customer name : "+c1.getCustName());
		System.out.println("Customer ID : "+c1.getCustId());
		System.out.println("Customer Account : "+c1.getAccount());
		
	}
}	