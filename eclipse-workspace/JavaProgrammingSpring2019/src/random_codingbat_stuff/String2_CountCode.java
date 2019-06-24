package random_codingbat_stuff;

public class String2_CountCode {
	public int countCode(String str) {
		  int count = 0;
		  for(int i = 0; i < str.length()-3; i++) {
		    if(str.substring(i,i+2).equals("co") && str.contains("e")) {
		      count++;
		    }
		  }
		  return count;
		}

}
