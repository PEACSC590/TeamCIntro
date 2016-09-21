import java.util.ArrayList;

public class SaddlePoints {

	public static ArrayList<Integer[]> findPoints(int[][] vals) {
		ArrayList<Integer[]> saddlePoints = new ArrayList<Integer[]>();
		
		int val;
		for (int i = 0; i < vals.length; i++) {
			for (int j = 0; j < vals[i].length; j++) {
				val = vals[i][j];
				if (isSaddlePointByRow(val) && isSaddlePointByCol(val)) {
					Integer[] point = { i, j };
					saddlePoints.add(point);
				}
			}
		}
		
		return saddlePoints;
	}

	private static boolean isSaddlePointByRow(int point) {
		// TODO: return true only if it's greater than or equal to every other value in its row
		return true;
	}
	
	private static boolean isSaddlePointByCol(int point) {
		// TODO: return true only if it's less than or equal to every other value in its column
		return true;
	}

}
