import java.util.Arrays;

public class C8Q81 {
    public static int solutionNum = 0;

    public static void main(String... args) {
	int[][] board = new int[8][8];
	oneStep(board, 8);
    }

    public static void printBoard(int[][] board) {
	for (int[] col : board) {
	    for (int i : col) System.out.printf("%2d", i);
	    System.out.println();
	}
	System.out.println();
    }

    public static void oneStep(int[][] board, int pieceNum) {
	if (pieceNum == 0) {
	    System.out.println("Solution: " + solutionNum++);
	    printBoard(board);
	    return;
	}
	for (int i = 0; i < 8; i++) {
	    if (checkOk(board, 8 - pieceNum, i)) {
		board[8 - pieceNum][i] = 1;
		oneStep(board, pieceNum - 1);
		board[8 - pieceNum][i] = 0;
	    }
	}
    }
    
    public static boolean checkOk(int[][] board, int x, int y) {
	for (int i = 0; i < 8; i++) {
	    for (int j = 0; j < 8; j++) {
		if (board[i][j] == 1) {
		    if ((i == x && j != y) || (j == y && i != x) || (Math.abs(x - i) == Math.abs(y - j) && x != i)) return false;
		}
	    }
	}
	return true;
    }
}