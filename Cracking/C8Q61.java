import java.util.*;

public class C8Q61 {
    public static void main(String... args) {
	int size = 5;
	Random r = new Random();
	int[][] array = new int[size][size];
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		array[i][j] = r.nextInt(2);
	    }
	}
	printArray(array);
	System.out.println();
	paint(array, 0, 0, 2, array[0][0]);
	printArray(array);
    }

    public static void printArray(int[][] array) {
	for (int[] sub : array) {
	    for (int i : sub) System.out.printf("%2d", i);
	    System.out.println();
	}
    }

    public static void paint(int[][] array, int x, int y, int newValue, int value) {
	if (x >= array.length || y >= array.length || x < 0 || y < 0) return;
	if (value != array[x][y]) return;
	array[x][y] = newValue;
	paint(array, x - 1, y, newValue, value);
	paint(array, x + 1, y, newValue, value);
	paint(array, x, y - 1, newValue, value);
	paint(array, x, y + 1, newValue, value);
    }
    
}