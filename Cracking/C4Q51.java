import java.util.*;

public class C4Q51 {
    public static void main(String... args) {
	Random r = new Random();
	int size = r.nextInt(10);
	BTree root = BTree.createInstance(size, true);
	root.print();
	BTree runner = root;
	System.out.println("In-order:");
	while (runner != null) {
	    System.out.printf("%3d", runner.getValue());
	    runner = nextIn(runner);
	}
	System.out.println();
	runner = root;
	System.out.println("Pre-order:");
	while (runner != null) {
	    System.out.printf("%3d", runner.getValue());
	    runner = nextPre(runner);
	}
	System.out.println();
	runner = root;
	runner = nextIn(runner);
	System.out.println("Post-order:");
	while (runner != null) {
	    System.out.printf("%3d", runner.getValue());
	    runner = nextPost(runner);
	}
	System.out.println();
    }

    public static BTree nextIn(BTree n) {
	if (n.getRight() != null) {
	    BTree r = n.getRight();
	    while (r.getLeft() != null) {
		r = r.getLeft();
	    }
	    return r;
	} 
	if (n.getParent() != null) {
	    BTree p = n.getParent();
	    if (p.getLeft() == n) return p;
	    n = p;
	    p = p.getParent();
	}
	return null;
    }

    public static BTree nextPre(BTree n) {
	if (n.getLeft() != null) return n.getLeft();
	if (n.getRight() != null) return n.getRight();
	while (n.getParent() != null) {
	    BTree p = n.getParent();
	    if (p.getLeft() == n && p.getRight() != null) return p.getRight();
	    n = p;
	    p = p.getParent();
	}
	return null;
    }

    public static BTree nextPost(BTree n) {
	if (n.getParent() == null) return null;
	BTree p = n.getParent();
	if (p.getRight() == n) return p;
	if (p.getRight() == null) return p;
	BTree r = p.getRight();
	while (true) {
	    if (r.getLeft() != null) r = r.getLeft();
	    else if (r.getRight() != null) r = r.getRight();
	    else return r;
	}
    }
}