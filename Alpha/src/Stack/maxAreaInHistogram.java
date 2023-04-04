package Stack;
import java.util.*;
public class maxAreaInHistogram {
	
	public static void maximumarea(int arr[]) {
		int maxArea=0;
		Stack<Integer> st=new Stack<>();
		//next smaller right
		int[] nsr=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				nsr[i]=arr.length;
			}
			else {
				nsr[i]=st.peek();
			}
			st.push(i);
		}
		
		//next smaller left
		st=new Stack<>();
		int[] nsl=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				nsl[i]=-1;
			}
			else {
				nsl[i]=st.peek();
			}
			st.push(i);
		}
		
		//current area
		
		//nsr[i]-nsl[i]-1;
		for(int i=0;i<arr.length;i++) {
			int height=arr[i];
			int width=nsr[i]-nsl[i]-1;
			int  currArea=height*width;
			maxArea=Math.max(currArea,maxArea);
		}
		System.out.println(maxArea);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,5,6,2,3};
		maximumarea(arr);
		
		
	}

}
//area of the largest histogram rectangle
//area=height(arr[i]) * width;
//width===> left smallest element(i) and right smallest element(j)===> so width is j-i-1;