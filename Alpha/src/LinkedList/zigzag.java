package LinkedList;
import java.util.LinkedList; 
import LinkedList.linkedList.Node;
public class zigzag {
	
	
	

	public  void reverse(Node head) {
	
		Node slow=head;
		Node fast=head.next;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		Node prev=null;
		Node c=slow;
		Node curr=c.next;
		c.next=null;
		Node next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
		Node right=prev;//right half head;
		Node left=head;
		Node nextl,nextr;
		
		while(right!=null && left!=null) {
			nextl=left.next;
			left.next=right;
			nextr=right.next;
			right.next=nextl;
			//update
			right=nextr;
			left=nextl;
		}
		
	}
	
	public static void main(String[] args) {
	    LinkedList ll=new LinkedList();
	    //find middle node(mid==2st half last node)
	    //second half reverse
	    //alternate merging
	    
	    ll.addLast(1);
	    ll.addLast(2);
	    ll.addLast(3);
	    ll.addLast(4);
	    ll.addLast(5);
	    System.out.println(ll);
	    zigzag z=new zigzag();
	    z.reverse(ll.head);
	    System.out.println(ll);
	    
	    
		

	}
}
