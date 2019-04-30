package day26_arrays;

public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 0;
		int treeSize = 0;
		int growth = 0;

		for (int i = 1; i <= 3; i++) {
			growth=1;
			year++;
			treeSize += growth;
			System.out.println("year "+year+" - growth "+growth+" cm");
			System.out.println("tree size: "+treeSize+"cm");
			//year 1 - growth 1 cm
			//tree size: 1cm
		}
		
		

		for(int k = 4; k <= 10;k++) {
			growth = 2;
			year++;
			treeSize += growth;
			System.out.println("year "+year+" - growth "+growth+" cm");
			System.out.println("tree size: "+treeSize+"cm");
		}
	}

}
