public class C2Q5 {
    public static void main(String []args) {
	Node<Integer> head = LinkedListGenerator.createIntLinkedList(10);
	head.print();
	Node<Integer> start = head;
	for(int i = 0; i < 3; i++) {
	    start = start.getNext();
	}
	start.print();
	Node<Integer> end = head;
	while(end.getNext() != null) {
	    end = end.getNext();
	}
	end.setNext(start);
	System.out.println(findCircleStart(head).getData());
    }

    /**
     *Find the start point of the circle in a circular linkedlist
     */
    public static Node<Integer> findCircleStart(Node<Integer> head) {
	Node<Integer> runner1 = head;
	Node<Integer> runner2 = head;
	do {
	    runner1 = runner1.getNext();
	    runner2 = runner2.getNext();
	    runner2 = runner2.getNext();
	} while(runner1 != runner2);
	runner1 = head;
	do {
	    runner1 = runner1.getNext();
	    runner2 = runner2.getNext();
	} while(runner1 != runner2);
	return runner1;
    }
}