import java.util.*;

public class C3Q53 {
    public static void main(String... args) {
	MyQueue q = new C3Q53().getIns();
	for (int i = 0; i < 10; i++) q.enqueue(i);
	for (int i = 0; i < 10; i++) System.out.println(q.dequeue());
    }

    public MyQueue getIns() {
	return new MyQueue();
    }

    class MyQueue {
	private LinkedList<Integer> stackin = null;
	private LinkedList<Integer> stackout = null;

	public MyQueue() {
	    stackin = new LinkedList<Integer>();
	    stackout = new LinkedList<Integer>();
	}

	public void enqueue(int v) {
	    while (!stackout.isEmpty()) stackin.push(stackout.pop());
	    stackin.push(v);
	}
	
	public int dequeue() {
	    while (!stackin.isEmpty()) stackout.push(stackin.pop());
	    return stackout.pop();
	}

    }
}