public class Account {
	private String accountName;
	private String accountNo;
	private String branchName;
	
	Account account;
	public Account(){
		
	}
	public Account (String accountName,String accountNo,String branchName){
		this.accountName=accountName;
		this.accountNo=accountNo;
		this.branchName=branchName;
	}
	public void setAccountName(String accountName){
		accountName=accountName;
	}
	public void setAccountNo(String accountNo){
		accountNo=accountNo;
	}
	public void setBranchName(String branchName){
		branchName=branchName;
	}
	public String getAccountName(){
		return accountName;
	}
	public String getAccountNo(){
		return accountNo;
	}
	public String getBranchName(){
		return branchName;
	}
}