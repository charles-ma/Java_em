import java.util.*;

public class C9Q61 {
    public static void main(String... args) {
	int[][] a = new int[10][10];
	for (int i = 0; i < 10; i++) {
	    for (int j = 0; j < 10; j++) {
		a[i][j] = i + j;
		System.out.printf("%3d", a[i][j]);
	    }
	    System.out.println();
	}
	printResult(a, 16);
    }

    public static void printResult(int[][] a, int v) {
	if (a == null) return;
	printResult(a, v, 0, a[0].length - 1);
    }

    public static void printResult(int[][] a, int v, int col, int row) {
	if (col >= a.length || row < 0) return;
	if (a[col][row] == v) {
	    System.out.println(col + " " + row);
	    return;
	}
	if (a[col][row] > v) printResult(a, v, col, row - 1);
	if (a[col][row] < v) printResult(a, v, col + 1, row);
    }
}