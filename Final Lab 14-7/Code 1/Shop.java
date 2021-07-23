import java.lang.*;

public class Shop {
	private String shopName;
	private String location;
	
	public Customer customer[];
	public RegularCustomer regularCustomer [];
	public Shop (){
		
	}
	public Shop (String shopName,String location,int csize,int rsize){
		
		this.shopName=shopName;
		this.location=location;
		this.customer=new Customer(csize);
		this.regularCustomer=new RegularCustomer(rsize);
	}
	public void setShopName(String shopName){
		
		this.shopName=shopName;
	}
	public void setLocation(string location){
		
		this.location=location;
	}
	public void insertCustomer(Customer customer){
		this.customer.add(customer);
		
	}
	public void insertRegularCustomer(RegularCustomer regularCustomer){
		this.regularCustomer.add(regularCustomer);
	}
	public String getShopName(){
		return shopName;
	} 
	public String getLocation(){
		return getLocation;
	}
	public void showCustomerDetails(){
		for(int i=0;i<this.customer.length;i++){
				System.out.println("Customer Name"+this.customer[i].getCustName());
				System.out.println("Customer Id"+this.customer[i].getCustId());
		}
		
		
	}
	public void showRegularCustomerDetails(){
		for(int i=0;i<this.regularCustomer.length;i++){
		System.out.println("Membership Id "+this.regularCustomer[i].getMembershipId());
		}
		
	}
	public void deleteCustomer(Customer customer){
		
		int flag=0;
		
		for(int i=0;i<this.customer.length;i++){
			
			if (this.customer[i]==customer){
				
				this.customer[i]=null;
				flag=1;
				break;
				
			}
		}
		
	}
	public void deleteRegularCustomer(RegularCustomer regularCustomer){
		int flag=0;
		
		for(int i=0;i<this.regularCustomer.length;i++){
			if (this.regularCustomer[i]==regularCustomer){
				this.regularCustomer[i]=null;
				flag=1;
				break;
			}
		}
	}
	
}