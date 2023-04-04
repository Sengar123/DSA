package Queue;
/* add:==> if s1==>s2    s1 push    s2==>s1*/
import java.util.*;
public class QueueUsingTwoStack {
	static Stack<Integer> s1=new Stack<>();
	static Stack<Integer> s2=new Stack<>();
	public static void add(int data) {
		
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		
	}
	public static int remove() {
		if(s1.isEmpty()) {
			return -1;
		}
		return s1.pop();
	}
	public static int peek() {
		if(s1.isEmpty()) {
			return -1;
		}
		return s1.peek();
	}
	public static boolean isEmpty() {
		return s1.isEmpty();
	}
	
	public static void main(String[] args) {
		QueueUsingTwoStack q=new QueueUsingTwoStack();
		q.add(2);
		q.add(5);
		q.add(6);
		q.add(7);
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}

	}

}
/* can be done such that add is in O(n) and remaining O(1) and another can be done such that 
 * remove is in O(n) and remaining O(1)
 */