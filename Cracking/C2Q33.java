import java.util.*;

public class C2Q33 {
    public static void main(String... args) {
	int size = 10;
	Node<Character> head = LinkedListGenerator.createCharLinkedList(size);
	Random r = new Random();
	int n = r.nextInt(size);
	Node<Character> nd = head;
	for (int i = 0; i < n; i++) {
	    nd = nd.getNext();
	}
	head.print();
	System.out.println(nd.getData());
	remove(head, nd);
	head.print();
    }

    public static void remove(Node<Character> head, Node<Character> nd) {
	Node<Character> n = nd.getNext();
	nd.setData(n.getData());
	nd.setNext(n.getNext());
    }
}