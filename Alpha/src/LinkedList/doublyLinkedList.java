package LinkedList;

public class doublyLinkedList {
	public class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	
	public void addFirst(int data) {
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		
		
	}
	public int removeFirst() {
		if(head==null) {
			System.out.println("doubly linked list is empty");
			return Integer.MIN_VALUE;
		}
		int da=head.data;
		head=head.next;
		head.prev=null;
		size--;
		return da;
	}
	public int removeLast() {
		if(head==null) {
			System.out.println("doubly linked list is empty");
			return Integer.MIN_VALUE;
		}
		int daa=tail.data;
		tail.prev=null;
		return daa;
	}
	public void addLast(int data) {
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		newNode.prev=tail;
		newNode.next=null;
	}
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + "<->");
			temp=temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doublyLinkedList dll=new doublyLinkedList();
		dll.addFirst(34);
		dll.addFirst(4);
		dll.addFirst(6);
		dll.addFirst(5);
		dll.addFirst(89);
		dll.print();
		System.out.println(size);
		System.out.println(dll.removeFirst());
		System.out.println(dll.removeFirst());
		dll.print();
		System.out.println(size);
		dll.addLast(1000);
		dll.print();
		System.out.println(dll.removeLast());
		dll.print();
		
		
	}

}
