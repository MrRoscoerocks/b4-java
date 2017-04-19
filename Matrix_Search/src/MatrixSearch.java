
public class MatrixSearch {
	private int[][] mat;
	int odds, evens;
	int rows, cols;

	public MatrixSearch(int rows, int cols, int upper) {

		this.rows = rows;
		this.cols = cols;
		
		mat = new int[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				mat[r][c] = (int) (upper * Math.random() + 1);
				System.out.println("r : " + r + ", c : " + c + ", value = " + mat[r][c]);
			}
		}

	}

	public int countOdds() {
		
		odds = 0;
		
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if(mat[r][c] % 2 == 1){
					odds++;
				}
			}
		}

		return odds;
	}
	
	public int countEvens() {
		
		evens = 0;
		
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if(mat[r][c] % 2 == 0){
					evens++;
				}
			}
		}

		return evens;
	}
	
	public int countPrimes(){
		
		return 0;
	}

}
