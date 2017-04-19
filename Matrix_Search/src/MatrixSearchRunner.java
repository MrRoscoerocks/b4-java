
public class MatrixSearchRunner {

	public static void main(String[] args) {
		MatrixSearch matSearch = new MatrixSearch(600, 1, 15);
		
		System.out.println("Odd count = " + matSearch.countOdds());
		System.out.println("Even count = " + matSearch.countEvens());

	}

}
