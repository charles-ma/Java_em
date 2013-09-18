import java.util.*;

public class C3Q24 {
    public static void main(String... args) {
	Stack s = new C3Q24().getStack();
	s.push(1);
	System.out.println(s.getMin());
	s.push(-5);
	System.out.println(s.getMin());
	s.push(6);
	System.out.println(s.getMin());
    }

    public Stack getStack() {
	return new Stack();
    }

    class Stack {
	private LinkedList<Integer> s = new LinkedList<Integer>();
	private LinkedList<Integer> m = new LinkedList<Integer>();

	public void push(int v) {
	    if (m.size() == 0) m.push(v);
	    else if (v <= m.peek()) m.push(v);
	    s.push(v);
	}

	public int pop() {
	    if (s.peek() != null && s.peek() <= m.peek()) m.pop();
	    return s.pop();
	}

	public int getMin() {
	    return m.peek() == null ? Integer.MIN_VALUE : m.peek();
	}
    }
}