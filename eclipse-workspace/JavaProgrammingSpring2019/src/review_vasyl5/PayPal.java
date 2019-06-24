package review_vasyl5;

public class PayPal implements Account {
	
	private int balance;
	private String email;
	private String password;
	
	public PayPal(int balance, String email, String password) {
		this.balance = balance;
		this.email = email;
		this.password = password;
	}

	@Override
	public int Deposit(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean Withdraw(int amount2) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
