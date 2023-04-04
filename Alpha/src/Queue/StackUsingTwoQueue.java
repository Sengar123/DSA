package Queue;
import java.util.*;
public class StackUsingTwoQueue {
	static Queue<Integer> q1=new LinkedList<>();
	static Queue<Integer> q2=new LinkedList<>();
	public static void push(int data) {
		if(!q1.isEmpty()) {
		q1.add(data);
		}
		else {
			q2.add(data);
		}
	}
	public static int pop() {
		if(isEmpty()) {
			System.out.println("stack empty");
			return -1;
		}
		int top=-1;
		if(!q1.isEmpty()) {
			while(!q1.isEmpty()) {
				top=q1.remove();
				if(q1.isEmpty()) {
					break;
				}
				q2.add(top);
			}
		}
		else {
			while(!q2.isEmpty()) {
				top=q2.remove();
				if(q2.isEmpty()) {
					break;
				}
				q1.add(top);
			}
		}
		return top;
	}
	public static boolean isEmpty() {
		return q1.isEmpty() && q2.isEmpty();
	}
	public static int peek() {
		if(isEmpty()) {
			System.out.println("stack empty");
			return -1;
		}
		int top=-1;
		if(!q1.isEmpty()) {
			while(!q1.isEmpty()) {
				top=q1.remove();
				q2.add(top);
			}
		}
		else {
			while(!q2.isEmpty()) {
				top=q2.remove();
				q1.add(top);
			}
		}
		return top;
	}

	public static void main(String[] args) {
		StackUsingTwoQueue  s=new StackUsingTwoQueue ();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.peek());
//		while(!s.isEmpty()) {
//			System.out.print(s.peek()+" ");
//			s.pop();
//		}

	}

}
