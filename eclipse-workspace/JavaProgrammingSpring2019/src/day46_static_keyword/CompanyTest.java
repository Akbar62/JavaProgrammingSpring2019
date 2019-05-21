package day46_static_keyword;

public class CompanyTest {

	public static void main(String[] args) {
		// print cname variable value
		System.out.println(Company.cname);
		System.out.println(Company.cname.toUpperCase());
		
//		Company.cname.toUpperCase();
//		System.out.println();
		// System -> classname
		// out -> static variable of type PrintStream class
		// println -> non-static method of PrintStream class
		
		Company c = new Company();
		System.out.println(c.cname);
		c.companyInfo();
		Company.companyInfo();
		
		

	}

}
