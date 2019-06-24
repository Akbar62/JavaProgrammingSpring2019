package review_vasyl5;

public class BankOfAmerica {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(5000);
		Account account2 = new BankAccount(10000);
		System.out.println(account1 instanceof Account); // true
		System.out.println(account2 instanceof Account); // true
		
		// cannot create an object from an interface 
		//Account account3 = new Account();
		
		
		
	}

}
