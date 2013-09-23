import java.util.*;

public class C8Q22 {
    public static void main(String... args) {
	int size = 3;
	new C8Q22().printPath(size);
    }

    public void printPath(int size) {
	if (size <= 0) return;
	printPath(size, new LinkedList<Pair>(), 0, 0);
    }

    public void printPath(int size, LinkedList<Pair> result, int x, int y) {
	Pair p = new Pair(x, y);
	result.add(p);
	if (x == size - 1 && y == size - 1) {
	    for (Pair e : result) e.printPair();
	    System.out.println();
	}
	if (x + 1 < size) printPath(size, result, x + 1, y);
	if (y + 1 < size) printPath(size, result, x, y + 1);
	result.removeLast();
    }

    class Pair {
	private int x, y;

	public Pair(int x, int y) {
	    this.x = x;
	    this.y = y;
	}

	public void printPair() {
	    System.out.print("(" + x + ", " + y + ")");
	}
    }
}