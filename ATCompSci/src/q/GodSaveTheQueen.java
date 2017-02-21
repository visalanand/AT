package q;

public class GodSaveTheQueen {

	private String[][] board;
	final String QUEEN = "Q";
	int co = 0;

	public GodSaveTheQueen(int a, int b) {
		board = new String[a][b];
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				board[r][c] = "*";
			}
		}
	}

	public boolean isSafe(int row, int col) {

		boolean isSafe = true;
		for (int i = 0; i < col; i++) {
			if (board[row][i].equals("Q")) {
				System.out.println("left col");
				isSafe = false;
			}
		}

		for (int x = board.length - 1; x > col; x--) {
			if (board[row][x].equals("Q")) {
				System.out.println("right col");
				isSafe = false;
			}
		}

		for (int y = 0; y < row; y++) {
			if (board[y][col].equals("Q")) {
				System.out.println("left row");
				isSafe = false;
			}
		}
		for (int u = board[0].length - 1; u > row; u--) {
			if (board[u][col].equals("Q")) {
				System.out.println("right row");
				isSafe = false;
			}
		}//----------------------------------
		for (int u = board[0].length - 1; u > row; u--) {
			if (board[u][col].equals("Q")) {
				System.out.println("right row");
				isSafe = false;
			}
		}
		for (int u = board[0].length - 1; u > row; u--) {
			if (board[u][col].equals("Q")) {
				System.out.println("right row");
				isSafe = false;
			}
		}
		for (int u = board[0].length - 1; u > row; u--) {
			if (board[u][col].equals("Q")) {
				System.out.println("right row");
				isSafe = false;
			}
		}
		for (int u = board[0].length - 1; u > row; u--) {
			if (board[u][col].equals("Q")) {
				System.out.println("right row");
				isSafe = false;
			}
		}
//		for (int p = row; p < board.length; p++) {
//			if (board[row+=1][col+=1].equals("Q")) {
//				System.out.println("right row");
//				isSafe = false;
//			}
//		}
	return isSafe;

	}

	public boolean queen(int y) {
		int a;
		co++;
		if (y >= board[0].length) {
			return true;
		}

		for ( a = 0; a < board[0].length; a++) {

			System.out.println(co);
			if (isSafe(a, y)) {
				board[a][y] = "Q";
			}

		}
			if (queen(y + 1)) {
				return true;
			}

			board[a][y] = "*";

		
		return false;

	}

	public String toString() {
		String a = "";
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[0].length; y++) {
				a += board[x][y] + " ";
			}
			a += "\n";
		}
		return a;
	}

	public static void main(String args[]) {

		GodSaveTheQueen gd = new GodSaveTheQueen(8, 8);
		gd.queen(0);
		System.out.println(gd);

	}

}
