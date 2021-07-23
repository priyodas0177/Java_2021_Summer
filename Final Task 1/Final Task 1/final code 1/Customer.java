import java.lang.*;
public class Customer{
	private String cusName;
	private String cusId;

	public Customer (){
		
	}
	public Customer (String cusName,String cusId){
		this.cusName=cusName;
		this.cusId=cusId;
	}
	public void setCusName(String cusName){
		this.cusName=cusName;
	}
	public void setCusId(String cusID){
		this.cusId=cusId;
	}
	public String getCusName(){
		return cusName;
	}
	public String getCusId(){
		return cusId;
	}
}