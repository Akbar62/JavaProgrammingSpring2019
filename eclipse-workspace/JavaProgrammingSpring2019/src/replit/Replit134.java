package replit;

import java.util.*;

public class Replit134 {

	public static void main(String[] args) {

		String[][] chessBoard = new String[8][8];
		// WRITE YOUR CODE HERE
		int k = 0;

		for (int i = 1; i <= 8; i++) {
			k = 0;
			for (char j = 'a'; j <= 'h'; j++) {

				chessBoard[i-1][k] = i +""+ j ;
				k++;
			}
		}

		// DO NOT CHANGE
		System.out.println(Arrays.deepToString(chessBoard));

	}

}
