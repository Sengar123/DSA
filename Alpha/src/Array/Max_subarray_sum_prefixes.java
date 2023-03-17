package Array;

public class Max_subarray_sum_prefixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,-2,6,-1,3};
		int[] prefixes=new int[5];
		prefixes[0]=arr[0];
		int max=Integer.MIN_VALUE;
		for(int i=1;i<5;i++) {
			prefixes[i]=prefixes[i-1]+arr[i];
		}
		int curr=0;
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
//				if(i==0) {
//					curr=prefixes[j];
//				}
//				else {
//					curr=prefixes[j]+prefixes[i-1];
//				}
//				
				curr=i==0?prefixes[j]:prefixes[j]-prefixes[i-1];
				if(curr>max) {
					max=curr;
				}
			}
		}
		System.out.println(max);

	}

}
