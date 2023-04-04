package Stack;
import java.util.*;
public class implementation {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	static class Stack{
		static Node head=null;
		public static boolean isEmpty() {
			return head==null;
		}
		public static void push(int data) {
			Node temp=new Node(data);
			if(isEmpty()) {
			head=temp;
			return;
			}
			temp.next=head;
			head=temp;
		}
		
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=head.data;
			head=head.next;
			return top;
		}
		
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			int top=head.data;
			return top;
		}
		
		
		
		
		//THROUGH ARRAY LIST
		/*static ArrayList<Integer> list=new ArrayList<>();
		public static void push(int data) {
			list.add(data);
		}
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			int top=list.get(list.size()-1);
			
			return top;
		}
		public static boolean isEmpty() {
			return list.size()==0;
		}*/
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack s=new Stack();
//		s.push(1);
//		s.push(6);
//		s.push(78);
//		s.push(67);
//		while(!s.isEmpty()) {
//			System.out.println(s.peek());
//			s.pop();
//		}
		
		Stack sc=new Stack();
		sc.push(67);
		sc.push(56);
		sc.push(3);
		sc.push(34);
		while(!sc.isEmpty()) {
		System.out.println(sc.peek());
		sc.pop();		}

	}

}
//push operation O(1)
//pop operation O(1)
//peek operation O(1)
//last in first out(LIFO)
//implementation by arrays, arraylist, linkedlist
