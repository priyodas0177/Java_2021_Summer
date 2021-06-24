import java.lang.*;
public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	public Account (){
		
	}
	public Account(int an,String n,double b){
		accountNumber=an;
		accountHolderName=n;
		balance=b;
		
	}
	
	public void setAccountNumber(int an)
	{
		accountNumber=an;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountHolderName(String ahn)
	{
		accountHolderName=ahn;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setBalance(double b)
	{
		balance=b;
	}
	public double getBalance()
	{
		return balance;
	}
	void showDetails()
	{
		System.out.println("Name : "+accountHolderName);
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Balance : "+balance);
	}
}