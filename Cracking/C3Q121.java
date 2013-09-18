import java.util.*;

class Stacks {
    public static void main(String... args) {
	Stacks ss = new Stacks(6);
	Stack s1 = ss.getStack();
	Stack s2 = ss.getStack();
	Stack s3 = ss.getStack();
	s1.push(1);
	s1.push(11);
	s1.push(111);
	s2.push(21);
	s3.push(31);
	s3.push(32);
	ss.printArray();
	System.out.println(s3.push(33));
	System.out.println(s3.pop());
	s2.push(22);
	ss.printArray();
	System.out.println(s2.pop());
	System.out.println(s2.pop());
	System.out.println(s2.pop());
	s3.push(33);
	ss.printArray();
    }

    private int size = 0;
    private Node[] a = null;
    private LinkedList<Integer> available = new LinkedList<Integer>();
    
    public Stacks(int size) {
	a = new Node[size];
	for (int i = 0; i < size; i++) available.add(i);
    }

    public Stack getStack() {
	return new Stack(a, available);
    }

    public void printArray() {
	for (Node n : a) System.out.printf("%4d", n.getValue());
	System.out.println();
    }

    class Stack {
	private Node[] a = null;
	private List<Integer> available = null;
	private int top = -1;

	public Stack(Node[] a, List<Integer> available) {
	    this.a = a;
	    this.available = available;
	}

	public boolean push(int v) {
	    if (available.size() == 0) return false;
	    Node n = new Node(v, top);
	    top = available.get(0);
	    a[top] = n;
	    available.remove(0);
	    return true;
	}

	public int pop() {
	    if (top == -1) return Integer.MIN_VALUE;
	    Node n = a[top];
	    available.add(top);
	    top = n.getPre();
	    return n.getValue();
	}
    }

    class Node {
	private int v = 0;
	private int pre = 0;
	
	public Node(int v, int pre) {
	    this.v = v;
	    this.pre = pre;
	}

	public int getValue() {
	    return v;
	}

	public int getPre() {
	    return pre;
	}
    }
}