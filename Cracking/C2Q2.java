public class C2Q2 {
    public static void main(String []args) {
	Node<Character> head = LinkedListGenerator.createCharLinkedList(10);
	head.print();
	System.out.println(findEle(head, 6).getData());
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
}

