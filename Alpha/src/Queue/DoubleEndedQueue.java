package Queue;
import java.util.*;
public class DoubleEndedQueue {

	public static void main(String[] args) {
	Deque<Integer> dq=new LinkedList<>();
	dq.addFirst(1);
	dq.addFirst(2);
	dq.addLast(67);
	dq.addLast(7);
	System.out.println(dq); //2 1 67 7 
	dq.removeFirst();//2
	dq.removeLast();//7
	System.out.println(dq);//1 67 
	System.out.println(dq.getFirst());//1
	System.out.println(dq.getLast());//67
	
	
	

	}

}
//double ended queue is like all operation can be perform from both ends
//addFirst()
//addLast()
//removeFirst()
//removeLast()
//getFirst()
//getLast()
//deque is already a interface in java collection