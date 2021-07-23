import java.lang.*;
public class RegularCustomer extends Customer{
	private String membershipId;
	
    public RegularCustomer(){
	
    }
    public RegularCustomer(String cusName,String cusId,String membershipId){
		super(cusName,cusId);
		
		this.membershipId=membershipId;
		
	
    }
	public void setMembershipId(String membershipId){
		this.membershipId=membershipId;
	}
	public String getMembershipId(){
		return membershipId;
	}
}