package oca_practice;

public class OCAQuiz6 {
	
public static void main(String[] args) {
		
		/*
		 1.	  Which two code fragments can be independently inserted at line n1 
		 	to enable the code to print the elements of the array in reverse order?
		 
					  public static void main(String[] args) {
			                 int arr[] = {10, 20, 30, 40, 50};
			                 int x= array.length;
			                     Line n1 
			                }
 
			A. while( x > 0 ){                              
						x--;                            		
				System.out.print( arr[x] +" " ) ;            
			}                                               
		
			
			 B. do { 
					x--;
				System.out.print( arr[x]+" " )  ;
				} while ( x >= 0);	
				

			C. while(x >= 0 ){                             	
				System.out.print( arr[x]+" " );               	
					x--;                                              
				}                                               
			
			
			D. do {
					System.out.print( arr[x]+" " );	
						x--;
					}while( x >=0 );
					

			E. while ( x > 0 ) {                             
				System.out.print( arr[--x]+" " );                  		
				}                                             	
		 
		 
		 	F.  while ( x > 0 ) {
		 				System.out.print( arr[x--] +" " );
		 				}
		 */
		
		
		
        
              
		
		
		/*
		2.	What's the result?
		
				public class cccc {

                   		public static void main(int[] args) {
                             System.out.println("int main");     

                        }


                      	public static void main(String[] args) {
                              System.out.println("String main");

                        }

                       	public static void main(double[] args) {
                                  System.out.println("double main");

                           }

                 		public static void main(char[] args) {
                                System.out.println("char main");
                                
                           }
            		}
		 */
		
		
		
		
		
		/*
		3.	Which code fragment causes a compilation error?

			A. float  flt = 100f;				B. float  flt  = 100; 

			C. double  y1 =  200;				D. int  y2  =  100;
				float  flt =  y1; 					float  flt =  y2;
                                   
		 */
		
		
		
		
		
		/*
		 4.	Which of one of the following will give compile error?

				A. ArrayList<String> list=new ArrayList<String>();
				B. ArrayList<String> list=new ArrayList<>();
				C. ArrayList<> list=new ArrayList<String>();
				D. List<String> list=new ArrayList<>();
		 
		 */
		
		
		
		
		/*
		 5.	Which of one of the following does not give any compile error?

                 public static void main(String[] args) {
                 
                               ArrayList<int> list=new ArrayList<>();
                                         list.add(10);
                               System.out.println(list);
                               
                       }
                       
           A.	[ 10 ]									B.	[ 0 ]
           C.	Compile Error	( Correct )				D.	[ ]	 
		 
		 */
	
			// arraylist does not support primitives
		
		
		
		
		
		/*
		 6.	What's the result? 

                 public static void main(String[] args) { 
                        ArrayList<Integer> list1=new ArrayList<>();
                                 list1.add(1);
                                 list1.add(2);
                                 list1.add(3);

                         			int a=1;
                               list1.remove(a);

                              System.out.println(list1); 

                         }
		 
		 	A.	[ 1, 3 ]	( Correct )						B.	[ 2 , 3 ]
		 	C.	Compile Error								D.	[ 0, 1, 3 ] 		 
		 
		 */
		
		
		
		
		
		
		/*
		 7.	What's the result? 

                 public static void main(String[] args) { 
                            ArrayList<Integer> list1=new ArrayList<>();
                                     list1.add(1);
                                     list1.add(2);
                                     list1.add(3);

                                     Integer a=1;
                               		list1.remove(a); \\ wrapper class removes the num 
                               		
	// wrapper class returns boolean expression 
	
                              System.out.println(list1); 

                      }
				
			A.	Compile Error									B.	[ 3 ]
			C.	[ 1, 3 ]										D.	[ 2, 3 ]   ( Correct )
		 
		 */
		
		
		
		/*
		 8.	What's the result? 

                 public static void main(String[] args) { 

                             int x= 7;
                		if(available(x)) {                // Line 1
                           System.out.println("Java SE");
                       }else {
                           System.out.println("Java EE");
                        } 

                  }
                  
              public static boolean available(int x) {
                         return x > 1 ? true : false;
                     }
                     
             A.	Java SE		( Correct )									B.	Java EE
             C.	Compilation fails at line n1.					D.	Exception is thrown at run time
 
		 
		 */
		
		
		
		
		
		/*
		 9.	What's the result?
		 
		  public static void main(String[] args) { 
                         int var1 = 200;
                    System.out.print( doCalc(var1) );
                    System.out.print( "      " + var1 );

                 }
                 
           static int doCalc(int var1) {
                       var1 = var1 * 2;
                      return var1;
                 } 
		 
		 A.	400   400									B.	200   200
		 C.	400   200	( Correct )						D.	Compilation fails	 
		 
		 */
		
		
		
		
		
		/*
		 10.	What's the result?
		 
		   public static void main(String[] args) { 
		   
                  String[][] chs = new String[2][];
	                      chs[0] = new String[2];
	                      chs[1] = new String[5];
                          	int i=97;

                  for(int a = 0; a < chs.length; a++) {
                      for(int b = 0; b < chs.length; b++) {
                               chs[a][b] =""+i; 
                                   i++;
                              }
                       }

            	for(int a = 0; a < chs.length; a++) {
                    for(int b = 0; b < chs[a].length; b++) {
                             System.out.print( chs[a][b] + " ");
                                     }
                          }

       			}
		
		A.	97  98  99  100  null  null  null						B.	97  98  99  100  101  102  103
		C.	Compilation rails										D.	Exception is thrown at run time	
		 
		 
		 */
		
		
		
		
		
	}
}
