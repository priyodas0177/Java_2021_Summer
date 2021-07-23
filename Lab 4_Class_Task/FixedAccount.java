public class FixedAccount extends Account{
	double interestRate;
	int year;
	FixedAccount(){
		
	}
	FixedAccount(String accountName,String accountNumber,double balance,double ir){
		super(accountName,accountNumber,balance);
		interestRate=ir;
	}
	public void setInterestRate(double ir){
		interestRate=ir;
	}
	public double getInterestRate(){
		return interestRate;
	}
	public void setYear(int y){
		year=y;
	}
	public int getYear(){
		return year;
	}
	public void calculateInterestAmount(){
		double balance=getBalance();
		double interestAmount=balance*year*interestRate;
	}
}