package Queue;
import java.util.*;
public class InterleaveTwoHalvesOfAQueen {

	public static void main(String[] args) {
		Queue<Integer> q1=new LinkedList<>();
		Queue<Integer> q2=new LinkedList<>();
	
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		q1.add(6);
//		q1.add(7);
//		q1.add(8);
//		q1.add(9);
//		q1.add(10);
		int n1=q1.size()/2;
		int n=q1.size();
		for(int i=0;i<n1;i++) {
			q2.add(q1.remove());
		}
		while(!q2.isEmpty()) {
			q1.add(q2.remove());
			q1.add(q1.remove());
		}
		while(!q1.isEmpty()) {
			System.out.print(q1.peek()+" ");
			q1.remove();
		}
		

	}

}
// 1 2 3 4 5 | 6 7 8 9 10
// 1 6 2 7 3   8 4 9 5 10