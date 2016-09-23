import java.util.ArrayList;

public class SaddlePoints {

	public static ArrayList<Integer[]> findPoints(int[][] vals) {
		ArrayList<Integer[]> saddlePoints = new ArrayList<Integer[]>();
		int row;
		int col;
		for (int i = 0; i < vals.length; i++) {
			for (int j = 0; j < vals[i].length; j++) {
				row = i;
				col = j;
				if (isSaddlePointByRow(row, col, vals) && isSaddlePointByCol(row, col, vals)) {
					Integer[] point = { i, j };
					saddlePoints.add(point);
				}
			}
		}
		
		return saddlePoints;
	}

	private static boolean isSaddlePointByRow(int row, int col, int[][] vals) {
		// TODO: return true only if it's greater than or equal to every other value in its row
		int rowmax = 0;
		for (int j = 0; j < vals.length; j++) {
			if (vals[row][j]>rowmax) {
					rowmax = vals[row][j];
			}
		}
		if (vals [row][col] >= rowmax) {
			return true;
		}
		else return false;
	}
	
	private static boolean isSaddlePointByCol(int row, int col, int[][] vals) {
		// TODO: return true only if it's less than or equal to every other value in its column
		int colmin = 9;
		for (int i = 0; i < vals.length; i++) {
			if (vals[i][col]<colmin) {
					colmin = vals[i][col];
			}
		}
		if (vals [row][col] <= colmin) {
			return true;
		}
		else return false;
	}

}
