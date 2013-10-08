import java.util.*;

public class C4Q53 {
    public static void main(String... args) {
	Random r = new Random();
	int size = r.nextInt(10);
	BTree root = BTree.createInstance(size, true);
	root.print();
	BTree runner = root;
	System.out.println("In-order:");
	while (runner != null) {
	    System.out.println(runner.getValue());
	    runner = getNextIn(runner);
	}
	System.out.println("Pre-order:");
	runner = root;
	while (runner != null) {
	    System.out.println(runner.getValue());
	    runner = getNextPre(runner);
	}
	System.out.println("Post-order:");
	runner = getNextIn(root);
	while (runner != null) {
	    System.out.println(runner.getValue());
	    runner = getNextPost(runner);
	}
    }

    public static BTree getNextIn(BTree n) {
	if (n.getRight() != null) {
	    BTree r = n.getRight();
	    while (true) {
		if (r.getLeft() != null) r = r.getLeft();
		else return r;
	    }
	}
	BTree p = n.getParent();
	while (p != null && p.getRight() == n) {
	    n = p;
	    p = n.getParent();
	}
	return p;
    }

    public static BTree getNextPre(BTree n) {
	if (n.getLeft() != null) return n.getLeft();
	if (n.getRight() != null) return n.getRight();
	BTree p = n.getParent();
	while (p != null) {
	    if (p.getLeft() == n && p.getRight() != null) return p.getRight();
	    n = p;
	    p = p.getParent();
	}
	return p;
    }

    public static BTree getNextPost(BTree n) {
	if (n.getParent() == null) return null;
	BTree p = n.getParent();
	if (p.getLeft() == n) {
	    if (p.getRight() != null) {
		BTree r = p.getRight();
		while (true) {
		    if (r.getLeft() != null) {
			r = r.getLeft();
		    } else if (r.getRight() != null) {
			r = r.getRight();
		    } else {
			return r;
		    }
		}
	    } else {
		return p;
	    }
	} else {
	    return p;
	}
    }
}