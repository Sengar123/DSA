package LinkedList;

import java.io.PrintStream;

import LinkedList.linkedList.Node;

public class detectCycle {
	//floyd cycle finding algorithm---> 
	//for detect the cycle in the linked list;
	//0 move distance==0
	//1move distance==1
	//2 moves distance==2.......
	
	public static Node head;
	public static Node tail;
	public static boolean cycle (Node head) {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;    //cycle exists.
			}
		}
		return false;
	}
	
	public static void removeCycle(Node head) {
		//find last node
		//last node.next=null
		Node slow=head;
		Node fast=head;
		boolean cycle=false;
		while(fast!=null && fast.next!=null) {
			/*when slow==fast then slow=head fast=+1;
			 slow+=1*/
			 slow=slow.next;
			 fast=fast.next.next;
			 if(fast==slow) {
			cycle=true;
			break;
			}
		}
		if(cycle==false) {
			return;
		}
		slow=head;
		Node prev=null;
		while(fast!=slow) {
		prev=fast;
		fast=fast.next;
		slow=slow.next;
		}
		prev.next=null;
		
	}
	public  static void print() {
		if(head==null) {
			System.out.println("LINKEDLIST IS EMPTY");
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.print("null");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head=new Node(1);
		
		Node temp=new Node(2);
		head.next=temp;
		head.next.next=new Node(3);
		head.next.next.next=temp;
		System.out.println(cycle(head));
		removeCycle(head);
	
		System.out.println(cycle(head));
		
	}

}
