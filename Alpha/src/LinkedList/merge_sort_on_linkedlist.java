package LinkedList;
import java.util.LinkedList; //java collection framework

import LinkedList.linkedList.Node;
public class merge_sort_on_linkedlist {
	/* ll=middle(mid)
	 * left half(mergesort)
	 * right half(mergesort)
	 * mid.next=null;
	 */
	private static Node head;
	private   Node getmid(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	private Node merge(Node head1,Node head2) {
		Node mergel=new Node(-1);
		Node temp=mergel;
		while(head1!=null && head2!=null) {
			if(head1.data<=head2.data) {
				temp.next=head1;
				head1=head1.next;
				temp=temp.next;
			}
			else {
				temp.next=head2;
				head2=head2.next;
				temp=temp.next;
			}
		}
		while(head1!=null) {
			temp.next=head1;
			head1=head1.next;
			temp=temp.next;
		}
		while(head2!=null) {
			temp.next=head2;
			head2=head2.next;
			temp=temp.next;
		}
		return mergel.next;
	}
	public  Node mergesort(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		//find mid
		Node mid=getmid(head);
		//left and right merge sort
		Node right=mid.next;
		mid.next=null;
		Node newl=mergesort(head);
		Node newr=mergesort(right);
		
		//return head;
		return merge(newl,newr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll=new LinkedList();
ll.addFirst(1000);
ll.addFirst(129);
ll.addFirst(12);
ll.addFirst(122);
ll.addFirst(1);
System.out.println(ll);

merge_sort_on_linkedlist  c=new merge_sort_on_linkedlist ();
ll.head=c.mergesort(ll.head);
System.out.println(ll);
	}

}
