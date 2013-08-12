import java.util.TreeSet;

public class TreeSetTest {
    
    public static void main(String... args) {
	TreeSet<NotComparable> ts = new TreeSet<NotComparable>();
	NotComparable nc1 = new NotComparable(1);
	NotComparable nc2 = new NotComparable(2);
	ts.add(nc1);
	ts.add(nc2);
	for (NotComparable nc : ts) {
	    System.out.println(nc);
	}
    }

}

class NotComparable implements Comparable{
    private int i = 1;

    public NotComparable(int i) {
	this.i = i;
    }

    @Override
    public String toString() {
	return Integer.toString(i);
    }

    /**
     * change the return value will result in different print orders of nc1 and nc2
     */
    @Override
    public int compareTo(Object o) {
	return 1;
    }
}