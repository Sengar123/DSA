package Queue;
import java.util.*;
public class QueueReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1=new LinkedList<>();Queue<Integer> q2=new LinkedList<>();
	
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		q1.add(6);
//		int n=q1.size();
//		int [] arr=new int[n];
//		int j=0;
//		while(!q1.isEmpty()) {
//			arr[j]=q1.remove();
//			j++;
//		}
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
		Stack<Integer> st=new Stack<>();
		while(!q1.isEmpty()) {
			st.push(q1.remove());
		}
		while(!st.isEmpty()) {
			System.out.print(st.pop()+" ");
		}

	}

}
