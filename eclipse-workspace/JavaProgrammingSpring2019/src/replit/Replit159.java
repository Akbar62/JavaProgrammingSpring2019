package replit;

public class Replit159 {

	public static void main(String[] args) {
		
		

	}
	
	 public String c_profits (int buyPrice,int sellPrice)
	  {
	    //your code here
	    
	    if(sellPrice > buyPrice) {
	      return "profit";
	    } else if (sellPrice < buyPrice) {
	      return "loss";
	    } else if (sellPrice == buyPrice) {
	      return "no loss";
	    }
		return null;
	   
	   
	   
	  }

}
