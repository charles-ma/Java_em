import java.util.HashMap;
import java.util.HashSet;

public class C2Q1 {
    public static void main(String[] args) {
	Node<Character> head = LinkedListGenerator.createCharLinkedList(10);	
	head.print();
	removeDup(head);
	head.print();
	Node<Character> head1 = LinkedListGenerator.createCharLinkedList(10);
	head1.print();
	removeDup1(head1);
	head1.print();
	Node<Character> head2 = LinkedListGenerator.createCharLinkedList(10);
	head2.print();
	removeDup2(head2);
	head2.print();
	Node<Character> head3 = LinkedListGenerator.createCharLinkedList(10);
	head3.print();
	removeDup3(head3);
	head3.print();
    }

    /**
     *This method uses a hashmap
     */
    public static void removeDup(Node<Character> head) {
	HashMap<Character, Integer> existing = new HashMap<Character, Integer>();
	Node<Character> pre = null;
	while(head != null) {
	    if(existing.containsKey(head.getData())) {
		pre.setNext(head.getNext());
	    } else {
		existing.put(head.getData(), 1);
		pre = head;
	    }
	    head = head.getNext();
	}
    }

    /**
     *This method does not use any additional space such as a hashmap
     */
    public static void removeDup1(Node<Character> head) {
	Node<Character> runner1 = head;
	Node<Character> runner2 = head.getNext();
	Node<Character> pre = head;
	while(runner2 != null) {
	    runner1 = head;
	    while(runner1 != runner2) {
		if(runner1.getData() == runner2.getData()) {
		    pre.setNext(runner2.getNext());
		    break;
		} else {
		    runner1 = runner1.getNext();
		}		
	    }
	    if(runner1 == runner2) pre = runner2;
	    runner2 = runner2.getNext();
	}
    }

    public static void removeDup2(Node<Character> head) {
	HashSet<Character> noDupCharSet = new HashSet<Character>();
	if (head == null) return;
	noDupCharSet.add(head.getData());
	while (head != null && head.getNext() != null) {
	    if (!noDupCharSet.add(head.getNext().getData())) head.setNext(head.getNext().getNext());
	    else head = head.getNext();
	}
    }

    public static void removeDup3(Node<Character> head) {
	if (head == null) return;
	Node<Character> runner = head;
	while (runner.getNext() != null) {
	    Node<Character> indexer = head;
	    while (indexer != runner.getNext()) {
		if (indexer.getData() == runner.getNext().getData()) {
		    runner.setNext(runner.getNext().getNext());
		    break;
		}
		indexer = indexer.getNext();
	    }
	    if (runner.getNext() == indexer) runner = runner.getNext();
	}
    }
}