import java.util.*;

public class C1Q73 {
    public static void main(String... args) {
	int size = 5;
	int[][] a = new int[size][size];
	Random r = new Random();
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		a[i][j] = r.nextInt(10);
	    }
	}
	printArray(a);
	System.out.println();
	setZeros(a);
	printArray(a);
    }

    public static void printArray(int[][] a) {
	for (int[] b : a) {
	    for (int i : b) System.out.printf("%2d", i);
	    System.out.println();
	}
    }

    public static void setZeros(int[][] a) {
	Set<Integer> rows = new HashSet<Integer>();
	Set<Integer> cols = new HashSet<Integer>();
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		if (a[i][j] == 0) {
		    rows.add(i);
		    cols.add(j);
		}
	    }
	}
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		if (rows.contains(i) || cols.contains(j)) a[i][j] = 0;
	    }
	}
    }
}