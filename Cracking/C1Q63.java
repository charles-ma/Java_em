import java.util.*;

public class C1Q63 {
    public static void main(String... args) {
	int size = 10;
	int[][] a = new int[size][size];
	Random r = new Random();
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		a[i][j] = r.nextInt(100);
	    }
	}
	printArray(a);
	rotate(a);
	System.out.println();
	printArray(a);
    }
    
    public static void printArray(int[][] a) {
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		System.out.printf("%3d", a[i][j]);
	    }
	    System.out.println();
	}
    }
    
    public static void rotate(int[][] a) {
	for (int i = 0; i < a.length / 2; i++) {
	    for (int j = i; j < a[i].length - i - 1; j++) {
		int tmp = a[i][j];
		a[i][j] = a[j][a.length - i - 1];
		a[j][a.length - i - 1] = a[a.length - i - 1][a.length - j - 1];
		a[a.length - i - 1][a.length - j - 1] = a[a.length - j - 1][i];
		a[a.length - j - 1][i] = tmp;
	    }
	}
    }
}