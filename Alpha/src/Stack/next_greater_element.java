package Stack;
import java.util.*;
public class next_greater_element {
	public static void nextGreater(int[] arr) {
		Stack<Integer> st=new Stack<>();
//		for(int i=0;i<arr.length;i++) {
//			st.push(arr[i]);
//		}
//		int maxx=st.pop();
//		arr[arr.length-1]=-1;
//		int j=arr.length-2;
//		while(!st.isEmpty()&& j>=0) {
//			if(st.peek()>maxx) {
//				arr[j]=-1;
//				maxx=st.peek();
//			}
//			else {
//				arr[j]=maxx;
//			}
//			j--;
//			st.pop();
//		}
		int nextgreater[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--){
			while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
				st.pop();
			}
			if(st.isEmpty()){
				nextgreater[i]=-1;
			}
			else{
				nextgreater[i]=arr[st.peek()];
			}
			st.push(i);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(nextgreater[i]+" ");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {17,18,5,4,6,1};
		nextGreater(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
