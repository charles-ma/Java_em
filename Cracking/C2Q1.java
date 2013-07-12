import java.util.HashMap;

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
}