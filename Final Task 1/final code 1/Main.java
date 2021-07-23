import java.lang.*;
public class Main{
	public static void main (String [] args){
		RegularCustomer r1=new RegularCustomer("Priyo","21445-11","0125d");
		System.out.println("Customer Name : "+r1.getCusName());
		System.out.println("Customer Id : "+r1.getCusId());
		System.out.println("Customer MembershipId : "+r1.getMembershipId());
	
	}
}