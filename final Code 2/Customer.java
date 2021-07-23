import java.lang.*;
public class Customer{
	private String custName;
	private String custId;
	private Account account;

	public Customer (){
		
	}
	public Customer (String custName,String custId){
		this.custName=custName;
		this.custId=custId;
	}
	public void setCustName(String custName){
		this.custName=custName;
	}
	public void setCustId(String custID){
		this.custId=custId;
	}
	public void  setAccount(Account account){
		this.account=account;
	}
	public String getCustName(){
		return custName;
	}
	public String getCustId(){
		return custId;
	}
	public Account getAccount(){
		return account;
	}
}