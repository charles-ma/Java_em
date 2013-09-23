import java.util.*;

public class C8Q22 {
    public static void main(String... args) {
	int size = 3;
	Set<Pair> limits = new HashSet<Pair>();
	C8Q22 sample = new C8Q22();
	limits.add(sample.new Pair(1, 1));
	sample.printPath(size, limits);
    }

    public void printPath(int size, Set<Pair> limits) {
	if (size <= 0) return;
	printPath(size, new LinkedList<Pair>(), 0, 0, limits);
    }

    public void printPath(int size, LinkedList<Pair> result, int x, int y, Set<Pair> limits) {
	Pair p = new Pair(x, y);
	if (limits.contains(p)) return;
	result.add(p);
	if (x == size - 1 && y == size - 1) {
	    for (Pair e : result) e.printPair();
	    System.out.println();
	}
	if (x + 1 < size) printPath(size, result, x + 1, y, limits);
	if (y + 1 < size) printPath(size, result, x, y + 1, limits);
	result.removeLast();
    }

    public class Pair {
	private int x, y;

	public Pair(int x, int y) {
	    this.x = x;
	    this.y = y;
	}

	public void printPair() {
	    System.out.print("(" + x + ", " + y + ")");
	}

	@Override
	public int hashCode() {
	    return x * 10 + y * 20;
	}

	public boolean equals(Object o) {
	    if (o == null || o.getClass() != Pair.class) return false;
	    Pair other = (Pair) o;
	    return x == other.x && y == other.y;
	}
    }
}