public class Customer extends Shop{
	public String custName;
	public String custtId;
	public Customer(){
		
	}
	public Customer (String custName,String custId){
		this.custName=custName;
		this.custId=custId;
	}
	public void setCustName(String custName){
		this.custName=custName;
	}
	public void setCustId(String custId){
		this.custId=custId;
	}
	public String getCustName(){
		return custName;
	}
	public String getCustId(){
		return CustId;
	}
}