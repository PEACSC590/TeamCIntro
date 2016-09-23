import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// use an array filled with random points to test the algorithm
		int[][] randVals = new int[5][5];
		Random rand = new Random();
		for (int i = 0; i < randVals.length; i++) {
			for (int j = 0; j < randVals[i].length; j++)
				System.out.print((randVals[i][j] = rand.nextInt(10)) + "  ");
			System.out.println();
		}
		
		ArrayList<Integer[]> saddlePoints = SaddlePoints.findPoints(randVals);
		if (saddlePoints.size() == 0) System.out.println("No saddle points");
		else {
			Integer[] point = new Integer[2];
			for (int i = 0; i < saddlePoints.size(); i++) {
				point = saddlePoints.get(i);
				System.out.println("(" + (point[0] + 1) + ", " + (point[1] + 1) + ")");
			}
		}
		
	}
	
}
