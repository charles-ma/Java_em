public class C2Q2 {
    public static void main(String []args) {
	Node<Character> head = LinkedListGenerator.createCharLinkedList(10);
	head.print();
	System.out.println(findEle(head, 6).getData());
	System.out.println(findEle1(head, 6).getData());
    }

    /**
     *Find the nth last element
     */
    public static Node<Character> findEle(Node<Character> head, int n) {
	int i = 1;
	Node<Character> runner = head;
	while(i < n) {
	    if(runner != null) {
		runner = runner.getNext();
	    } else {
		break;
	    }
	    i++;
	} 
	if(i < n - 1) return null;
	Node<Character> runner1 = head;
	while(runner.getNext() != null) {
	    runner = runner.getNext();
	    runner1 = runner1.getNext();
	}
	return runner1;
    }

    public static Node<Character> findEle1(Node<Character> head, int n) {
	if (head == null) return null;
	Node<Character> runner1 = head;
	Node<Character> runner2 = head;
	for (int i = 0; i < n - 1; i++) {
	    runner1 = runner1.getNext();
	    if (runner1 == null) return null;
	}
	while (runner1.getNext() != null) {
	    runner1 = runner1.getNext();
	    runner2 = runner2.getNext();
	}
	return runner2;
    }
}

