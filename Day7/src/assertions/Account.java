package assertions;


public class Account {
	private double balance;
	public double getBalance() {
		
		return balance;
	}
	
	public void setBalance(double amount) {
		
		this.balance = amount;
	}
	
	public double deposit(double amount) {
		
		double oldBalance = balance;
		balance += amount;
		
		//more processing...
		assert balance > oldBalance;
		//assert balance == oldBalance;
		//assert false;
		return balance;
	}
	
	public double withdraw (double amount) {
		
		double oldBalance = balance;
		balance -= amount;
		//more processing ...
		assert balance < oldBalance;
		//assert balance == oldBalance;
		//assert false;
		return balance;
	}
	
	public static void main (String[] args) {
		
		Account account = new Account();
		account.deposit(50.0);
		account.withdraw(100.0);
	}

}
