package practice;

import java.util.*;

public class Test6 {
	
	

	public static void main(String[] args) {
//
//		List<Character> list = new ArrayList<>();
//
//		list.add(0, 'V');
//
//		list.add('T');
//
//		list.add(1, 'E');
//
//		list.add(3, 'O');
//
//		if (list.contains('O')) {
//
//			list.remove('O');
//
//		}
//
//		for (char ch : list) {
//
//			System.out.print(ch);
//
//		}
		
		String [ ]   fruits =  {"apple", "banana",  "mango",  "orange"};

        for(String  fruit :  fruits) {

            System.out.print( fruit + " " );

            if( fruit.equals("mango") ) {

                continue;

            }

            System.out.println("salad!");

            break;

        }  

	}

}
