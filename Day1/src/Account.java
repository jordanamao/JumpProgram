

//this is git account
public class Account {
	
	private String ownerName;
	private double balance;
	
	
	public Account() {
		ownerName = "Unassigned";
		balance = 0.0;
	}
	
	public void add(double amt) {
		balance = balance + amt;
	}
	
	public void deduct(double amt) {
		
		balance = balance - amt;
	}
	
	public double getCurrentBalance() {
		return balance;
		
	}
	public String getOwnerName() {
		
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	

	public void setInitialBalance(double balance) {
		this.balance = balance;
	
	}


}
