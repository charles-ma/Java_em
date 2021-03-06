import java.util.*;

public class C2Q43 {
    public static void main(String... args) {
	Random r = new Random();
	int size1 = r.nextInt(10) + 1;
	int size2 = r.nextInt(10) + 1;
	Node<Integer> head1 = LinkedListGenerator.createIntLinkedList(size1);
	Node<Integer> head2 = LinkedListGenerator.createIntLinkedList(size2);
	head1.print();
	head2.print();
	add(head1, head2).print();
	add1(head1, head2).print();
    }

    public static Node<Integer> add(Node<Integer> head1, Node<Integer> head2) {
	return add(head1, head2, 0);
    }

    public static Node<Integer> add(Node<Integer> head1, Node<Integer> head2, int c) {
	if (head1 == null && head2 == null && c == 0) return null;
	int v1 = head1 == null ? 0 : head1.getData();
	int v2 = head2 == null ? 0 : head2.getData();
	int sum = v1 + v2 + c;
	return new Node<Integer>(sum % 10, add(head1 == null ? null : head1.getNext(), head2 == null ? head2 : head2.getNext(), sum / 10));
    }

    /**
     * Iteration solution will be more space-efficient 
     */
    public static Node<Integer> add1(Node<Integer> head1, Node<Integer> head2) {
	int c = 0;
	Node<Integer> head = new Node<Integer>(Integer.MIN_VALUE, null);
	Node<Integer> runner = head;
	while (head1 != null || head2 != null || c != 0) {
	    int v1 = head1 == null ? 0 : head1.getData();
	    int v2 = head2 == null ? 0 : head2.getData();
	    int sum = v1 + v2 + c;
	    c = sum / 10;
	    runner.setNext(new Node<Integer>(sum % 10, null));
	    runner = runner.getNext();
	    head1 = head1 == null ? null : head1.getNext();
	    head2 = head2 == null ? null : head2.getNext();
	}
	// Make the first node ready to be gced
	return head = head.getNext();
    }
}