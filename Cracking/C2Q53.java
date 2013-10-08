import java.util.*;

public class C2Q53 {
    public static void main(String... args) {
	int size = 10;
	Node<Character> head = LinkedListGenerator.createCharLinkedList(10);
	Node<Character> runner1 = head;
	Node<Character> runner2 = head;
	while (runner1.getNext() != null) runner1 = runner1.getNext();
	Random r = new Random();
	int s = r.nextInt(10);
	for (int i = 0; i < s; i++) runner2 = runner2.getNext();
	head.print();
	runner1.setNext(runner2);
	System.out.println(runner2.getData());
	printStart(head);
    }

    public static void printStart(Node<Character> head) {
	Node<Character> runner1 = head.getNext();
	Node<Character> runner2 = runner1.getNext();
	while (runner1 != runner2) {
	    runner1 = runner1.getNext();
	    runner2 = runner2.getNext().getNext();
	}
	runner1 = head;
	while (runner1 != runner2) {
	    runner1 = runner1.getNext();
	    runner2 = runner2.getNext();
	}
	System.out.println(runner1.getData());
    }
}