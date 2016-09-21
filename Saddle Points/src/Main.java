import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// use an array filled with random points to test the algorithm
		int[][] randPoints = new int[5][5];
		Random rand = new Random();
		for (int i = 0; i < randPoints.length - 1; i++)
			for (int j = 0; j < randPoints[i].length - 1; j++)
				randPoints[i][j] = rand.nextInt(10);
		
		SaddlePoints.findPoints(randPoints);
		
	}
	
}
