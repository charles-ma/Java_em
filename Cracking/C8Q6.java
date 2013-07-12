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
    
    public static void printColor(int[][] canvas) {
	for(int i = 0; i < canvas.length; i++) {
	    for(int j = 0; j < canvas[i].length; j++) {
		System.out.print(String.format("%2d", canvas[i][j]));
	    }
	    System.out.println();
	}
    }

    public static void changeColor(int[][] canvas, int x, int y, int newColor) {
	int oldColor = canvas[x][y];
	changeColor(canvas, x, y, newColor, oldColor);
    }

    public static void changeColor(int[][] canvas, int x, int y, int newColor, int oldColor) {
	if(x >= canvas.length || x < 0 || y >= canvas[x].length || y < 0) return;
	if(canvas[x][y] != oldColor) return;
	canvas[x][y] = newColor;
	changeColor(canvas, x + 1, y, newColor, oldColor);
	changeColor(canvas, x - 1, y, newColor, oldColor);
	changeColor(canvas, x, y + 1, newColor, oldColor);
	changeColor(canvas, x, y - 1, newColor, oldColor);
    }
}