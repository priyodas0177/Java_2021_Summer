public class MainClass{
	public static void main(String arga []){
		FixedAccount f1=new FixedAccount();
		
		f1.setInterestRate(5);
		f1.setYear(2000);
		
		f1.setAccountName("Horish");
		f1.setAccountNumber("1234567976");
		f1.setBalance(2036);
		
		System.out.println("Account name: "+f1.getAccountName());
		System.out.println("Account number: "+f1.getAccountNumber());
		System.out.println("Balance is: "+f1.getBalance());
		System.out.println("Interest Rate is : "+f1.getInterestRate());
		System.out.println("year is : "+f1.getYear());
	}
}