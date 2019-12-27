package practice;

public class LinkedList {
	Node head;
	LinkedList(Node h){
		this.head = h;
	}
	public void insertBeforeHead(int value){
		Node n = new Node(value);
		n.next = head;
		head = n;

	}
	public void printList(){
		for(Node n = head; n != null; n = n.next)
			System.out.println(n.value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node h = new Node(1);
		LinkedList l = new LinkedList(h);
		for(int i = 2; i < 50; i++){
			l.insertBeforeHead(i);
		}
		l.printList();
	}
}
