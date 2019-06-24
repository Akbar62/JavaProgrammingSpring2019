package oca_practice;

public class OCAQuiz3 {
	
public static void main(String[] args) {	
		
		
		/*
		 	
		 	1. What's the result of the following code fragment?

				public static void main(String[] args) {

                          String str1 = "Java";      
                         String[] str2 = {"J","a","v","a"};
                  
                           String str3 ="";  
		               for(int i=0; i<str2.length; i++) {
		                         str3 += str2[i];
		                     }
		              	boolean b1 = (str1==str3);  // false
		            	boolean b2=(str1.equals(str3));   // true

              		System.out.println(b1+",   "+b2);

				}
				
				
		A. true, false								B. false, false
		C. false, true	( Correct )					D. true, true				
		 
		 */
		
		
		
	
		
		
		
		/*
		 	2. What's the result?

					public static void main(String[] args) {

                                    int numbers[];
                                    numbers[0] = 10;
                                   numbers[1] =20;

                            	numbers=new int[4];
                                 	numbers[2]=30;
                                  	numbers[3]=40;
                System.out.println(Arrays.toString(numbers));
                

					}
					
		 A. [ 0,  0,  30,  40 ]								 B. [10, 20, 30, 40]
		 C. Compilation fails 	( Correct )					 D. An exception is thrown at runtime.
		 
		 
		 */
		
		
		
		
		/*
		 3. What's the result?

				public static void main(String[] args) {

                                    int numbers[];
                                    numbers =new int[2];
                                    numbers[0] = 10;
                                   numbers[1] =20;

                            	numbers=new int[4];
                                 numbers[2]=30;
                                  numbers[3]=40;
                		System.out.println(Arrays.toString(numbers));

				}
		 
		 A. Compilation fails							B. [ 10,  20,  30,  40 ]
		 C. [ 0,  0,  30,  40 ]	 ( Correct )			D. An exception is thrown at run time
		 
		 */
		
		
		
		
		
		/*
		 4. What's the result of the following code fragment? 

                     public static void main(String[] args) {

                                         String str="Hello World";
                                              	str.trim();
                                        int z=str.indexOf(" ");
                                   System.out.println(z);

							}
							
			A. -1								B. 5   ( Correct )
			C. 0								D. An exception is thrown at run time.				
		 
		 
		 */
		
		
		
		
		
		
		/*
		 	5. Which code fragment, when inserted at line n1, enables the App class to print Equal?

					public static void main(String[] args) {

                                String str1 ="Java";
                           String str2 = new String("java");
                           
                            **** Line 1 *****   {
                              System.out.println("Equal");
                           }else {
                               System.out.println("Not Equal");
                               }

                          }
                          
              A. if(str1==str2)						     		B. if(str1.equals(str2))
              C. if(str1.equalsIgnoreCase(str2))  ( Correct )   D. if(str1.toLowerCase() == str2.toLowerCase())
		 
		 */
		
		
		
		
		
		/*
		 6. Given: 

               public static void main(String[] args) {
                          String stuff ="TV";
                           String res="";

                        if(stuff.equals("TV")) {
                                res="Walter";
                        }else if(stuff.equals("Movie")) {
                                res="White";
                             }else {
                                 res="No result";
                         }

               }

		Which code fragment can replace the if block?

	A. stuff.equals ("TV") ? res =  "Walter":stuff.equals("Movie") ? res = "White" : res = "No Result"; 

	B. res = stuff.equals ("TV") ? "Walter" else stuff.equals ("Movie")? "White" : "No Result"; 

	C. res = stuff.equals ("TV")? "Walter" : stuff.equals ("Movie")? "White" : "No Result";  ( Correct )
		 
		 */
	
		
		
		
		
		/*
		 7.   public class Spartans{

                          public static void main(String[] args) {

                                              String num1 = args[1];
                                               String num2=args[2];
                                               String num3=args[3];
                                     System.out.println("number is "+num3);

                                }

							}

			Which command-line arguments should you pass to the program to obtain 
			the following output? number is 2
			
			A. java Spartans 0 1 2 3     
			B. java Spartans 1 2 2 3     
			C. java Spartans 1 2 2 3 4   
			D. java Spartans 1 3 2 2	
			
			
		 */
		
		
		
		
		
		
		/*
		 8. Which of the following code fragment inserted at line 1, enables the 
		 console to prints:        red   blue  small  medium   ?

		 					public static void main(String[] args) {
                                  String shirts[][] =new String[2][2];
                                       shirts[0][0]="red";
                                       shirts[0][1]="blue";
                                       shirts[1][0]="small";
                                        shirts[1][1]="medium";

                                   ** Line 1 ***
                                   *

                                  }


					A. for(int i=1; i<2; i++) {
					       for(int j=1; j<2; j++) {
			                    System.out.println(shirts[i][j]);
			                    }
					        }
					
					B. for(int i=0; i<2; ) {
			              for(int j=0; j<2; ) {
			                    System.out.println(shirts[i][j]);
			                             j++;
			                    }
			                   i++;
		                }
					
					C. for(int i=1; i<2; i++) {
				            for(int j=1; j<i; j++) {
			                    System.out.println(shirts[i][j]);
				                    }
					        }
					
					D. none of the above
		 
		 */
	
	
		
		
		
		
		/*
		 9. public static void main(String[] args) {

                         String str ="Batch 11";
                          int  z  =  str.trim().length();
                        System.out.println( z );

                       }

				What's the result?
				
			
		A. 9									B. 7
		C. compile error						D. 8				 
		 
		 */
		
		
		
	
		
	}

}
