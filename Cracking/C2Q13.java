import java.util.*;

public class C2Q13 {
    public static void main(String... args) {
	Node<Character> head = LinkedListGenerator.createCharLinkedList(10);
	head.print();
	removeDup2(head);
	head.print();
    }

    public static void removeDup(Node<Character> head) {
	Set<Character> track = new HashSet<Character>();
	Node<Character> pre = head;
	head = head.getNext();
	track.add(pre.getData());
	while (head != null) {
	    char v = head.getData();
	    if (!track.add(v)) {
		pre.setNext(head.getNext());
	    } else {
		pre = head;
	    }
	    head = head.getNext();
	}
    }

    public static void removeDup1(Node<Character> head) {
	Node<Character> pre = head;
	head = head.getNext();
	int track = 0;
	while (head != null) {
	    char v = head.getData();
	    int mask = 1 << (Character.toLowerCase(v) - 97);
	    if ((mask & track) != 0) {
		pre.setNext(head.getNext());
	    } else {
		pre = head;
		track |= mask;
	    }
	    head = head.getNext();
	}
    }

    public static void removeDup2(Node<Character> head) {
	Node<Character> pre = head;
	Node<Character> runner = head.getNext();
	while (runner != null) {
	    Node<Character> runner1 = head;
	    while (runner1 != runner) {
		if (runner1.getData() == runner.getData()) {
		    pre.setNext(runner.getNext());
		    runner = runner.getNext();
		    break;
		}		    
		runner1 = runner1.getNext();
	    }
	    if (runner1 == runner) {
		pre = runner;
		runner = runner.getNext();
	    }
	}
    }
}