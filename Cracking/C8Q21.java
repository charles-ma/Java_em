import java.util.*;

public class C8Q21 {
    public static void main(String... args) {
	LinkedList<Point> badPoints = new LinkedList<Point>();
	badPoints.add(new Point(1, 1));
	badPoints.add(new Point(0, 1));
	printAllMoves(new Point(0, 0), 3, badPoints);
	System.out.println();
	printAllMoves(new Point(0, 0), 3, new LinkedList<Point>());
    }

    public static void printAllMoves(Point start, int size, LinkedList<Point> badPoints) {
	move(start, size, new LinkedList<Point>(), badPoints);
    }

    public static void move(Point start, int size, LinkedList<Point> result, LinkedList<Point> badPoints) {
	for (Point p : badPoints) {
	    if (p.x == start.x && p.y == start.y) return;
	}
	result.add(start);
	if (start.x == size - 1 && start.y == size - 1) {
	    for (Point p : result) System.out.print("(" + p.x + "," + p.y + ") ");
	    System.out.println();
	    result.removeLast();
	    return;
	}
	if (start.x + 1 < size) move(new Point(start.x + 1, start.y), size, result, badPoints);
	if (start.y + 1 < size) move(new Point(start.x, start.y + 1), size, result, badPoints);
	result.removeLast();
    }
}

class Point {
    public int x = 0;
    public int y = 0;

    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }

}