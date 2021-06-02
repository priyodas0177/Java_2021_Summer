import java.lang.*;
public class account{
	String number;
	String accName;
	public account(){
		
	}
	public account(String n,String an){
		number=n;
		accName=an;
	}
	void displayInfo(){
		System.out.println("number :" +number);
		System.out.println("AccNAme :" +accName);
	}
	public static void main(String args[])
	{
		account a1=new account("20","priyo");
		a1.displayInfo();
	}
}