package Queue;
import java.util.*;
public class import_queue_using_util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue <Integer> q=new LinkedList<>();
		Queue<Integer> q=new ArrayDeque<>();
		q.add(1);
		q.add(2);
		q.add(3);
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}

	}

}

/* queue is interface not a class and interface can never create object so we implement queue using two 
 * classes named as LinkedList and ArrayDeque.
 * all operation is in O(1)
 */
