public class C2Q3 {
    public static void main(String []args) {
	Node<Character> head = LinkedListGenerator.createCharLinkedList(10);
	head.print();
	Node<Character> node = head;
	for(int i = 0; i < 5; i++) {
	    node = node.getNext();
	}
	System.out.println(node.getData());
	deleteNode(node);
	head.print();
    }

    public static void deleteNode(Node<Character> node) {
	Node<Character> next = node.getNext();
	if(next == null) node = null;
	else {
	    node.setNext(next.getNext());
	    node.setData(next.getData());
	}
    }
}