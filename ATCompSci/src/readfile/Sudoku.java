package readfile;

public class Sudoku {

	// static int [][] array = new int [4][4];

	public static int[][] makeSudoku(int[][] array, int row) {
		//Base Case 
		if (row >= array.length) {

			return array;
		} else {

			int col = 0;

			// System.out.println(row);
			//Add Numbers
			for (int x = 1; x <= array[0].length; x++) {
				//Check Row and Column
				if (!checkArray(row, col, x, array)) {

					array[row][col++] = x;
					
					// System.out.println("array[row][col]" + array[row][col]);

				}

				if (x == array[0].length && col < array[0].length)
					x = 0;

			}

			return makeSudoku(array, ++row);

		}

	}

	public static boolean checkArray(int row, int column, int num, int[][] array) {
		for (int c = 0; c < array[0].length; c++) {
			if (array[row][c] == num) {
				return true;
			}
		}

		for (int r = 0; r < array.length; r++) {

			if (array[r][column] == num) {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int [][] plsWork = new int [4][4];
		System.out.println("4x4");
		int[][] array = new int[4][4];
		array = makeSudoku(array, 0);
		System.out.println("Printing");
		for (int[] a : array) {
			for (int b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}

		System.out.println("5x5");
		 array = new int[5][5];
		array = makeSudoku(array, 0);
		System.out.println("Printing");
		for (int[] a : array) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		 
			System.out.println("6x6");
		
		 array = new int[6][6];
			array = makeSudoku(array, 0);
			System.out.println("Printing");
			for (int[] a : array) {
				for (int b : a) {
					System.out.print(b + " ");
				}
				System.out.println();
			}
		
	}

}
