import java.util.*;

class C8Q2 {
    public static void main(String[] args) {
	new C8Q2().findPaths(3);
    }

    public void findPaths(int n) {
	findPaths(new Point(n - 1, n - 1), new ArrayList<Point>());
    }

    public void findPaths(Point p, ArrayList<Point> path) {
	path.add(p);
	Point right = new Point(p.x - 1, p.y);
	Point down = new Point(p.x, p.y - 1);
	if(p.x == 0 && p.y == 0) {
	    for(int i = 0; i < path.size(); i++) {
		path.get(i).print();
	    }
	    System.out.println();
	} else if(p.x < 0 || p.y < 0) {
	    
	} else {
	    findPaths(right, path);
	    findPaths(down, path);
	}
	path.remove(path.size() - 1);
    }

    class Point {
	public int x;
	public int y;
	
	public Point(int x, int y) {
	    this.x = x;
	    this.y = y;
	}

	public void print() {
	    System.out.println("x: " + x + " y: " + y);
	}
    }
}