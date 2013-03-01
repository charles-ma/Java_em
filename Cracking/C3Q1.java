@SuppressWarnings("unchecked")
public class C3Q1 {
    Node<Integer>[] tops = new Node[3];
    Node<Integer> node = new Node<Integer>();

    int i = 0;
    double d = i;
    public static void main(String[] args) {
	System.out.println("executed!");
	Integer[] iArray = new Integer[3];
	Object[] oArray = iArray;
	oArray[1] = "asb";
    }

    private Object a() {
	return null;
    }

}

class Node<T> {
    public Node() {
	
    }
} 