package LinkedList;
import LinkedList.linkedList;
public class search_using_recursion {
	public static class Node{
		int data;
		Node next;
		public void Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int helper(Node head,int key) {
		if(head==null) {
			return -1;
		}
		if(head.data==key) {
			return 0;
		}
		int idx=helper(head.next,key);
		if(idx==-1) {
			return -1;
		}
		
			return idx+1;
//O(n)		
	}
	public static int search1(int key) {
		return helper(head,key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList ll=new linkedList();
		
		ll.addFirst(89);
		ll.addLast(8);
		ll.addFirst(78);
		System.out.println(ll.search1(8));
		

	}

}
