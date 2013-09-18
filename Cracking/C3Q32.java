import java.util.*;

public class C3Q32 {
    public static void main(String... args) {
	SetOfStack s = new C3Q32().getIns(3);
	for (int i = 0; i < 10; i++) {
	    s.push(i);
	}
	for (int i = 0; i < 3; i++) {
	    System.out.println(s.pop());
	}
	s.print();
	System.out.println(s.popAt(1));
	System.out.println(s.popAt(1));
	System.out.println(s.popAt(1));
	System.out.println(s.popAt(1));
	s.print();
    }

    public SetOfStack getIns(int cap) {
	return new SetOfStack(cap);
    }
    
    class SetOfStack {
	private LinkedList<LinkedList<Integer>> ss = new LinkedList<LinkedList<Integer>>();
	private int cap = 0;

	public SetOfStack(int cap) {
	    this.cap = cap;
	}
	
	public void push(int v) {
	    if (ss.size() == 0 || ss.getFirst().size() == cap) {
		LinkedList<Integer> s = new LinkedList<Integer>();
		s.push(v);
		ss.push(s);
	    } else {
		ss.getFirst().push(v);
	    }
	}

	public int pop() {
	    if (ss.size() == 0) return Integer.MIN_VALUE;
	    LinkedList<Integer> s = ss.getFirst();
	    int v = s.pop();
	    if (s.size() == 0) ss.pop();
	    return v;
	}

	public void print() {
	    for (LinkedList<Integer> l : ss) {
		for (int i : l) System.out.printf("%3d", i);
		System.out.println();
	    }
	    System.out.println();
	}
	
	public int popAt(int index) {
	    if (index >= ss.size()) return Integer.MIN_VALUE;
	    LinkedList<Integer> s = ss.get(index);
	    int v = s.pop();
	    if (s.size() == 0) ss.remove(index);
	    return v;
	}
    }
}