package LinkedList;
import java.util.*;

import LinkedList.search_using_recursion.Node;

public class linkedList {
	public static class Node{
		int data;
		Node next;  //reference variable for the next node (object)
		public Node(int data)//constructor
		{
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	
	
	
	
	public void addFirst(int data) {
		//step1 -->create new node
		Node temp=new Node(data);
		size++;
		if(head==null) {
			head=tail=temp;
			return;
		}
		//step2--- newnode next=head;
		temp.next=head;
		//step 3 --> head= newnode;
		head=temp;
}
	
	
	
	
	public  void reverse() {
		Node prev=null;
		Node curr=tail=head;
		Node nextt;
		while(curr!=null) {
			nextt=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextt;
	}
		head=prev;
}
	
	
	
	
	public void addLast(int data) {
		//step1 -->create new node
		Node temp=new Node(data);
		size++;
		if(head==null) {
			head=tail=temp;
			return;
		}
		//step2---newnode      next=head;
		temp.next=null;
		tail.next=temp;
		//step 3 -->           head=newnode;
		tail=temp;
}
	
	
	
	public void addMiddle(int data,int idx) {
		if(idx==0) {
			addFirst(data);
			return;
		}
		Node temp=new Node(data);
		size++;
		Node temp1=head;
		int i=0;
		while(i<idx-1){
			temp1=temp1.next;
			i++;
		}
		temp.next=temp1.next;
		temp1.next=temp;;
		
	}
	
	
	
	
	public int deleteFirst() {
		if(size==0) {
			System.out.println("LINKED LIST IS EMPTY");
			return Integer.MIN_VALUE;
		}
		if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		int val=head.data;
		size--;
		head=head.next;
		return val;
		
	}
	
	
	
	
	public int deleteLast() {
		if(size==0) {
			System.out.println("LINKED LIST IS EMPTY");
			return Integer.MIN_VALUE;
		}
		if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		Node prev=head;
		for(int i=0;i<size-2;i++) {
		prev=prev.next;	
		}
		int val=tail.data;
		prev.next=null;
		
		size--;
	return val;
}
	
	
	
	
	public int search(int key) {
		Node temp=head;
		int i=0;
		while(temp!=null) {
			if(temp.data==key) {
				return i;
			}
			temp=temp.next;
			i++;
		}
		return -1;
		
	}
	
	
	
	
public void  print() {
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

public boolean checkpalindrome() {
	if(head==null ||head.next==null) {
		return true;
	}
	Node midnode=middle(head);
	Node prev =null;
	Node curr=midnode;
	Node next;
	while(curr!=null) {
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
	}
	Node right=prev;//right half head;
	Node left=head;
	while(right!=null) {
		if(left.data!=right.data) {
			return false;
		}
		left=left.next;
		right=right.next;
	}
	return true;
}



public  int helper(Node head,int key) {
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
		}
public  int search1(int key) {
	return helper(head,key);
}


//floyd cycle finding algorithm---> 
//for detect the cycle in the linked list;
//0 move distance==0
//1move distance==1
//2 moves distance==2.......
public boolean cycle (Node head) {
	Node slow=head;
	Node fast=head;
	while(fast!=null && fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
		if(slow==fast) {
			return true; //cycle exists.
		}
	}
	return false;
}
public Node middle(Node head) {
	//by using slow fast approach
	Node slow=head;
	Node fast=head;
	while(fast!=null && fast.next!=null) {
	slow=slow.next;
	fast=fast.next.next;
	}
	return slow;//slow is my mid node.
	}
	


public void delete_nth_node_from_last(int n) {
	//last nth node means   (size()-n+1) from the starting
	//calculate size
	int size1=0;
	Node temp=head;
	while(temp!=null) {
		temp=temp.next;
		size1++;
	}
	if(n==size1) {
		head=head.next;//removeFirst
		return;
	}
	//size1-n
	int i=1;
	int idxtofind=size1-n;
	Node prev=head;
	while(i<idxtofind) {
		prev=prev.next;
		i++;
	}
	prev.next=prev.next.next;
	return;
}
	public static void main(String[] args) {
		linkedList ll=new linkedList();
		
		ll.addFirst(1);
//		ll.addLast(90);
		ll.addFirst(2);
//		ll.addMiddle(45,1);
//		ll.print();
//		System.out.println();
//		ll.deleteFirst();
//		ll.print();
//		System.out.println();
//		System.out.println(ll.size);
//		ll.deleteLast();
//		ll.print();
//		System.out.println();
//		System.out.println(ll.size);
		ll.addFirst(3);
		ll.addFirst(1);
//		ll.addFirst(74);
//		ll.addFirst(78);
		ll.print();
		System.out.println();
//		System.out.println("element is present at a index "+ ll.search(7));
//		System.out.println("element is present at a index "+ ll.search(1));
//		System.out.println("element is present at a index "+ ll.search1(72));
//		
//		ll.reverse();
//		ll.print();
//		System.out.println();
//		ll. delete_nth_node_from_last(3);
//		ll.print();
//		ArrayList<Integer> a=new ArrayList<>();
//		Node temp=head;
//		while(temp!=null) {
//			a.add(temp.data);
//			temp=temp.next;
//		}
//		System.out.println(a);
//		String a1="";
//		String a2="";
//		for(int i=0;i<a.size();i++) {
//			a1=a1+a.get(i);
//		}
//		for(int i=a.size()-1;i>=0;i--) {
//			a2=a2+a.get(i);
//		}
//		System.out.println(a1+   "   "+ a2);
//		if(a1==a2) {
//			System.out.println("list is plaindrome");
//		}
//		else {
//			System.out.println("not");
//		}
//		
		System.out.println(ll.checkpalindrome());
		System.out.println(ll.cycle(head));

	}

}
