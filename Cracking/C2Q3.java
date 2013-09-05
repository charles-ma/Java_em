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
	if (node == null || node.getNext() == null) return;
	Node<Character> nextNode = node.getNext();
	node.setData(nextNode.getData());
	node.setNext(nextNode.getNext());
    }
}