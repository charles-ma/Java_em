import java.util.*;

public class C1Q72 {
    public static void main(String... args) {
	Random r = new Random();
	int size = 10;
	int[][] a = new int[size][size];
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		int n = r.nextInt(10);
		a[i][j] = n;
	    }
	}
	printArray(a);
	changeToZero(a);
	System.out.println();
	printArray(a);
    }

    public static void printArray(int[][] a) {
	for (int[] sub : a) {
	    for (int i : sub) {
		System.out.printf("%2d", i);
	    }
	    System.out.println();
	}
    }

    public static void changeToZero(int[][] a) {
	Set<Integer> col = new HashSet<Integer>();
	Set<Integer> row = new HashSet<Integer>();
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		if (a[i][j] == 0) {
		    col.add(i);
		    row.add(j);
		}
	    }
	}
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		if (col.contains(i) || row.contains(j)) a[i][j] = 0;
	    }
	}
    }
    
}