import java.util.*;

public class C9Q62 {
    public static void main(String... args) {
	int size = 10;
	int[][] a = new int[size][size];
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		a[i][j] = i + j;
		System.out.printf("%3d", i + j);
	    }
	    System.out.println();
	}
	Random r = new Random();
	int n = r.nextInt(30);
	System.out.println(n);
	printPos(n, a);
    }

    public static void printPos(int n, int[][] a) {
	int i = 0, j = a[0].length - 1;
	while (i < a.length && j >= 0) {
	    if (n == a[i][j]) {
		System.out.println("(" + i + "," + j + ")");
		return;
	    } else if (n < a[i][j]) {
		j--;
	    } else {
		i++;
	    }
	}
    }
    
}