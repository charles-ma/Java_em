import java.util.*;

public class C3Q23 {
    public static void main(String... args) {
	Stack s = new C3Q23().getStack();
	s.push(1);
	System.out.println(s.getMin());
	s.print();
	s.push(-5);
	System.out.println(s.getMin());
	s.print();
	s.pop();
	System.out.println(s.getMin());
	s.print();
    }

    public Stack getStack() {
	return new Stack();
    }
    
    class Stack {
	private LinkedList<Node> list = null;
	private int min = Integer.MAX_VALUE;
	
	public Stack() {
	    list = new LinkedList<Node>();
	}

	public void push(int v) {
	    Node n = new Node(v, min);
	    list.push(n);
	    min = Math.min(v, min);
	}

	public int pop() {
	    Node n = list.pop();
	    min = n.getMin();
	    return n.getValue();
	}
	
	public void print() {
	    for (Node n : list) System.out.printf("%3d", n.getValue());
	    System.out.println();
	}

	public int getMin() {
	    return min;
	}
    }

    class Node {
	private int v = 0;
	private int min = 0;
	
	public Node(int v, int min) {
	    this.v = v;
	    this.min = min;
	}

	public int getValue() {
	    return v;
	}

	public int getMin() {
	    return min;
	}
    }
}