import java.util.*;

public class C8Q62 {
    public static void main(String... args) {
	int size = 5;
	int[][] canvas = new int[size][size];
	Random r = new Random();
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) canvas[i][j] = r.nextInt(2);
	}
	printCanvas(canvas);
	render(canvas, 0, 0, 2);
	System.out.println();
	printCanvas(canvas);
    }

    public static void printCanvas(int[][] c) {
	for (int[] a : c) {
	    for (int i : a) System.out.printf("%2d", i);
	    System.out.println();
	}
    }

    public static void render(int[][] canvas, int x, int y, int color) {
	int size = canvas.length;
	if (x < 0 || x >= size || y < 0 || y > size) return;
	int oldColor = canvas[x][y];
	canvas[x][y] = color;
	if (x + 1 < size && canvas[x + 1][y] == oldColor) render(canvas, x + 1, y, color);
	if (y + 1 < size && canvas[x][y + 1] == oldColor) render(canvas, x, y + 1, color);
	if (x - 1 >= 0 && canvas[x - 1][y] == oldColor) render(canvas, x - 1, y, color);
	if (y - 1 >= 0 && canvas[x][y - 1] == oldColor) render(canvas, x, y - 1, color);
    }
    
}