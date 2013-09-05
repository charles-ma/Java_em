import java.util.LinkedList;

public class C3Q51 {
    public static void main(String... args) {
	MyQueue queue = new MyQueue();
	for (int i = 0; i < 10; i++) queue.enQueue(i);
	queue.printQueue();
	for (int i = 0; i < 5; i++) {
	    System.out.println(queue.deQueue());
	    queue.printQueue();
	}
    }
}

class MyQueue {
    private LinkedList<Integer> in;
    private LinkedList<Integer> out;

    public MyQueue() {
	in = new LinkedList<Integer>();
	out = new LinkedList<Integer>();
    }

    public void enQueue(int value) {
	in.push(value);
    }

    public int deQueue() {
	for (int i : in) out.push(i);
	in.clear();
	int result = out.pop();
	for (int i : out) in.push(i);
	out.clear();
	return result;
    }

    public void printQueue() {
	for (int i : in) System.out.printf("%3d", i);
	System.out.println();
    }
}