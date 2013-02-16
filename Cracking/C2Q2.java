public class C2Q2 {
    public static void main(String []args) {
	Node<Character> head = LinkedListGenerator.createCharLinkedList(10);
	head.print();
	System.out.println(findEle(head, 6));
    }

    /**
     *Find the nth last element
     */
    public static char findEle(Node<Character> head, int n) {
	if(n < 0 || head == null) return ' ';
	Node<Character> runner1 = head; 
	Node<Character> runner2 = head; 
	for(int i = 0; i < n; i++) {
	    runner1 = runner1.getNext();
	    if(runner1 == null) return ' ';
	}
	while(runner1.getNext() != null) {
	    runner1 = runner1.getNext();
	    runner2 = runner2.getNext();
	}
	return runner2.getData();
    }
}

