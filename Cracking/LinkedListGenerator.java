import java.util.Random;

public class LinkedListGenerator {

    public static void main(String[] args) {
	Node<Character> head = createCharLinkedList(5);
	while(head != null) {
	    System.out.println(head.getData());
	    head = head.getNext();
	}
	Node<Integer> head1 = createIntLinkedList(5);
	while(head1 != null) {
	    System.out.println(head1.getData());
	    head1 = head1.getNext();
	}
	Node<Double> head2 = LinkedListGenerator.<Double>createLinkedList(new Double[] {new Double(1.0), new Double(2.3), new Double(3.1)});
	head2.print();
    }

    public static Node<Character> createCharLinkedList(int len) {
	Node<Character> head = null;
	Random ranGen = new Random();

	for(int i = 0; i < len; i++) {
	    int ranNum = ranGen.nextInt(26);
	    char ranChar = (char)(ranNum + 97);
	    Node<Character> node = new Node<Character>(ranChar, head);
	    head = node;
	}

	return head;
    }

    public static Node<Integer> createIntLinkedList(int len) {
	Node<Integer> head = null;
	Random ranGen = new Random();

	for(int i = 0; i < len; i++) {
	    int ranNum = ranGen.nextInt(10);
	    Node<Integer> node = new Node<Integer>(ranNum, head);
	    head = node;
	}

	return head;
    }

    public static <T> Node<T> createLinkedList(T[] values) {
	Node<T> head = null;
	Node<T> runner = null;
	for (T value : values) {
	    if (runner == null) {
		head = new Node<T>(value, null);
		runner = head;
	    } else {
		runner.setNext(new Node<T>(value, null));
		runner = runner.getNext();
	    }
	}
	return head;
    }
}

class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next) {
	this.data = data;
	this.next = next;
    }

    public void setNext(Node<T> next) {
	this.next = next;
    }

    public void setData(T data) {
	this.data = data;
    }

    public Node<T> getNext() {
	return this.next;
    }

    public T getData() {
	return this.data;
    }

    public void print() {
	Node<T> node = this;
	while(node != null) {
	    System.out.print(node.getData() + " ");
	    node = node.getNext();
	}
	System.out.println();
    }
}