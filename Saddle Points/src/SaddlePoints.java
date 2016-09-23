import java.util.ArrayList;

public class SaddlePoints {

	public static ArrayList<Integer[]> findPoints(int[][] vals) {
		ArrayList<Integer[]> saddlePoints = new ArrayList<Integer[]>();
		for (int i = 0; i < vals.length; i++) {
			for (int j = 0; j < vals[i].length; j++) {
				if (isSaddlePointByRow(i, j, vals) && isSaddlePointByCol(i, j, vals)) {
					saddlePoints.add(new Integer[]{ i, j });
				}
			}
		}
		
		return saddlePoints;
	}

	private static boolean isSaddlePointByRow(int row, int col, int[][] vals) {
		// return true iff the value is greater than or equal to every other value in its row
		int rowmax = 0;
		for (int i = 0; i < vals[0].length; i++) {
			if (vals[row][i] > rowmax) rowmax = vals[row][i];
		}

		return (vals[row][col] >= rowmax);
	}
	
	private static boolean isSaddlePointByCol(int row, int col, int[][] vals) {
		// return true iff the value is less than or equal to every other value in its column
		int colmin = 9;
		for (int i = 0; i < vals.length; i++) {
			if (vals[i][col] < colmin) colmin = vals[i][col];
		}

		return (vals[row][col] <= colmin);
	}

}
