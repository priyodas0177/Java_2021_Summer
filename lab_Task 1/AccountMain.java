public class AccountMain {
	public static void main (String [] args){
		Account a1=new Account(208167,"priyo",100);
		a1.showDetails();
		
		Account s2=new Account();
		s2.setAccountNumber(2006789);
		s2.setAccountHolderName("priyo");
		s2.setBalance(2000);
		
		System.out.println("account number"+s2.getAccountNumber());
		System.out.println("name"+s2.getAccountHolderName());
		System.out.println("balance"+s2.getBalance());
		
	}
}