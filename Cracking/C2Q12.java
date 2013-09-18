import java.util.*;

public class C2Q12 {
    public static void main(String... args) {
	Node<Character> head = LinkedListGenerator.createCharLinkedList(10);
	head.print();
	removeDup1(head);
	head.print();
    }

    public static void removeDup(Node<Character> head) {
	Set<Character> hash = new HashSet<Character>();
	while (head != null && head.getNext() != null) {
	    if (!hash.add(head.getNext().getData())) head.setNext(head.getNext().getNext());
	    else head = head.getNext();
	}
    }

    public static void removeDup1(Node<Character> head) {
	Node<Character> start = head;
	while (head != null && head.getNext() != null) {
	    Node<Character> runner = start;
	    while (runner != head.getNext()) {
		if (runner.getData() == head.getNext().getData()) {
		    head.setNext(head.getNext().getNext());
		    break;
		}
		runner = runner.getNext();
	    }
	    if (runner == head.getNext()) head = head.getNext();
	}
    }
}