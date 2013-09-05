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
	System.out.println(findCircleStart1(head).getData());
    }

    /**
     * Find the start point of the circle in a circular linkedlist
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

    public static Node<Integer> findCircleStart1(Node<Integer> head) {
	if (head == null || head.getNext() == null || head.getNext().getNext() == null) return null;
	Node<Integer> runner1 = head.getNext();
	Node<Integer> runner2 = head.getNext().getNext();
	while (runner1 != runner2) {
	    if (runner1.getNext() == null || runner2.getNext() == null || runner2.getNext().getNext() == null) return null;
	    runner1 = runner1.getNext();
	    runner2 = runner2.getNext().getNext();
	}
	while (head != runner1) {
	    head = head.getNext();
	    runner1 = runner1.getNext();
	}
	return head;
    }
}