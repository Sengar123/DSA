package Queue;
import java.util.*;
public class StackAndQueueUsingDeque {
	static Deque<Integer> dq=new LinkedList<>();
	
	//STACK
	public static void push(int data) {
		dq.addLast(data);
	}
	public static int pop() {
		int t=dq.removeLast();
		return t;
	}
	public static int peek() {
		int t=dq.getLast();
		return t;
	}
	public static boolean isEmpty() {
		return dq.isEmpty();
	}
	
	//QUEUE
	public static void add(int data) {
		dq.addLast(data);
	}
	public static int remove() {
		int t=dq.removeFirst();
		return t;
	}
	public static int peek1() {
		int t=dq.getFirst();
		return t;
	}

	public static void main(String[] args) {
		StackAndQueueUsingDeque st=new StackAndQueueUsingDeque();
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println("ELEMENTS OF STACK ARE:");
		while(!st.isEmpty()) {
			System.out.print(st.peek() + " ");
			st.pop();
		}
		System.out.println();
		System.out.println("ELEMENTS OF QUEUE ARE:");
		StackAndQueueUsingDeque q=new StackAndQueueUsingDeque();
		q.add(1);
		q.add(2);
		q.add(3);
		while(!q.isEmpty()) {
			System.out.print(q.peek1() +" ");
			q.remove();
		}

	}

}
