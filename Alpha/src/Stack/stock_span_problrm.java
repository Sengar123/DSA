package Stack;
import java.util.*;
public class stock_span_problrm {
	
	public static void stockSpan(int[] stocks,int[] span) {
		Stack<Integer> st=new Stack<>();
		span[0]=1;
		st.push(0);
		for(int i=1;i<stocks.length;i++) {
			int curr=stocks[i];
			while(!st.isEmpty() && curr>stocks[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				span[i]=i+1;			}
			else {
				int high=st.peek();
				span[i]=i-high;
			}
			st.push(i);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stocks[]={100,80,60,70,60,85,100};
		int span[]=new int[stocks.length];
		stockSpan(stocks,span);
		int max=Integer.MIN_VALUE;
		for(int i=0;i<span.length;i++) {
			System.out.print(span[i]+ " ");
			max=Math.max(span[i],max);
		}
		System.out.println();
		System.out.print(max);
		
	}

}
//span-maximum no. of consecutive days for which price<=todays price;
//span=index-prevhighidx;