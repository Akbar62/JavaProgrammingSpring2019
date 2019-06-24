package review_vasyl4;

public class BankAccount {
	private String name;
	private double balance;

	public BankAccount(String name) {
		this.name = name;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public double getBalance() {
		return balance;
	}

	// a method withdraw that accepts a double, and deducts
	// the amount from the account balance

	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public String toString() {
		//return "BankAccount [name=" + name + "]";
		return "BankAccount [name=" + name + ", balance=" + balance + "]";
	}

}
