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
    public static Node<Character> removeDup(Node<Character> head) {
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	if(head == null) return null;
	map.put(head.getData(), 1);
	Node<Character> pre = head;
	Node<Character> curr = head.getNext();
	while(curr != null) {
	    if(map.containsKey(curr.getData())) {
		pre.setNext(curr.getNext());
		curr = curr.getNext();
	    } else {
		map.put(curr.getData(), 1);
		pre = curr;
		curr = curr.getNext();
	    }
	}
	return head;
    }

    /**
     *This method does not use any additional space such as a hashmap
     */
    public static Node<Character> removeDup1(Node<Character> head) {
	if(head == null) return null;
	Node<Character> pre = head;
	Node<Character> curr = head.getNext();
	Node<Character> runner = head;
	while(curr != null) {
	    while(runner != curr) {
		if(runner.getData() == curr.getData()) {
		    pre.setNext(curr.getNext());
		    break;
		}
		runner = runner.getNext();
	    }
	    if(runner == curr) {
		pre = curr;
		curr = curr.getNext();
		runner = head;
	    } else {
		curr = curr.getNext();
		runner = head;
	    }
	}
	return head;
    }
}