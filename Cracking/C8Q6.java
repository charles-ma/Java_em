import java.util.*;

class C8Q6 {
    public static void main(String[] args) {
	int[][] grid = new int[10][10];
	Random ran = new Random();
	for(int i = 0; i < 10; i++) {
	    for(int j = 0; j < 10; j++) {
		grid[i][j] = ran.nextInt(2);
	    }
	}
	printColor(grid);
	changeColor(grid, 0, 0, 2);
	System.out.println();
	printColor(grid);
    }

    public static void printColor(int[][] a) {
	for(int i = 0; i < a.length; i++) {
	    for(int j = 0; j < a[i].length; j++) {
		System.out.print(String.format("%2d",a[i][j]));
	    }
	    System.out.println();
	}
    }

    /**
     * Facade for the recursion method
     */
    public static void changeColor(int[][] a, int x, int y, int newColor) {
	changeColor(a, x, y, newColor, a[x][y]);
    }
    
    /**
     * Recursion method
     */
    public static void changeColor(int[][] a, int x, int y, int newColor, int oldColor) {
	if(x >= 0 && x < a.length && y >= 0 && y < a[0].length) {
	    int color = a[x][y];
	    if(color == oldColor) {
		a[x][y] = newColor;
		changeColor(a, x - 1, y, newColor, oldColor);
		changeColor(a, x + 1, y, newColor, oldColor);
		changeColor(a, x, y - 1, newColor, oldColor);
		changeColor(a, x, y + 1, newColor, oldColor);
	    }
	} else {
	    return;
	}
    }
}