package oca_practice_questions;

public class Q39 {
	public static void main(String[] args) {
		
		System.out.println(maskCC("1234-5678-4321-9876"));
	}
	
	public static String maskCC(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		
		StringBuilder sb = new StringBuilder(x);
		sb.append(creditCard, 15, 19);
		
		return x + sb;
	}

}
