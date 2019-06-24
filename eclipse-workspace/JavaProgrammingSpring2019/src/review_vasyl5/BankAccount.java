package review_vasyl5;

public class BankAccount implements Account {

	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	@Override
	public int Deposit(int amount) {
		balance += amount;
		return balance;
	}

	@Override
	public boolean Withdraw(int amount2) {
		if (amount2 <= balance) {
			balance -= amount2;
			return true;
		}
		return false;
	}

}
