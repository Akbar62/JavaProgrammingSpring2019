package review_vasyl4;

public class CheckingAccount extends BankAccount {
	
	private boolean overdraft;

	public CheckingAccount(String name, boolean overdraft) {
		super(name);
		this.overdraft = overdraft;
	}
	
	public boolean hasOverdraft() {
		return overdraft;
	}
	
	public boolean clearCheck(double amount) {
		if(amount < getBalance() || hasOverdraft()) {
			super.withdraw(amount);
			return true;
		}
		System.out.println("Not enough credit");
		return false;
	}
	
	
	

}
