package Array;

public class Max_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,6,8,10};
		int[] arr1=new int[5];
		int curr=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				 curr=0;
				for(int k=i;k<=j;k++) {
					curr+=arr[k];
				}
				System.out.println(curr);
				if(max<curr) {
					max=curr;
				}
			}
		}
		System.out.println("The maximum sum of subarray " + max);

	}

}
