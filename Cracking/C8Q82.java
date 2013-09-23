public class C8Q82 {
    public static void main(String... args) {
	int size = 8;
	new C8Q82().solve(size);
    }

    private static int count = 0;

    public static void solve(int size) {
	int[][] board = new int[size][size];
	placeQueen(board, 0);
    }

    public static void placeQueen(int[][] board, int col) {
	if (col == board.length) {
	    System.out.println("solution: " + count++);
	    for (int[] row : board) {
		for (int i : row) System.out.printf("%2d", i);
		System.out.println();
	    }
	    System.out.println();
	    return;
	}
	for (int i = 0; i < board[col].length; i++) {
	    if (isOk(board, col, i)) {
		board[col][i] = 1;
		placeQueen(board, col + 1);
		board[col][i] = 0;
	    }
	}
    }

    public static boolean isOk(int[][] board, int col, int k) {
	for (int i = 0; i < col; i++) {
	    for (int j = 0; j < board[col].length; j++) {
		if (board[i][j] == 1) {
		    if (i == col || j == k || Math.abs(col - i) == Math.abs(k - j)) return false;
		}
	    }
	}
	return true;
    }
}
