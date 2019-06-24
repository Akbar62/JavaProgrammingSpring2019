package review_vasyl4;

public class CapitalOne {
	public static void main(String[] args) {
		CheckingAccount account1 = new CheckingAccount("James Bond", true);
		System.out.println(account1);
		account1.deposit(100000);
		account1.clearCheck(5000);
		System.out.println(account1.getBalance());
	}

}
