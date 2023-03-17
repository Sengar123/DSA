package Array;

public class subarray_sum_kadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,-2,6,-1,3};;
		int curr=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			curr+=arr[i];
			if(curr<0) {
				curr=0;
			}
			if(max<curr) {
				max=curr;
			}
		}
		System.out.println(max);

	}

}
//according to kadane's if we add two +ve no. then we get a positive no. and if we add a big +ve no. with small
//-ve no. then we get also a positive no. but problem arises when we add a small +ve no. and a large -ve no.
//it will give a large negative no. so take "0" instead  of taking negative value.
// 			                  		-2 -3 4 -1 -2 1 5 -3
//curr_sum(initial=0)		   		 0  0 4  3  1 2 7  4
//maximum_sum(initial=-infinity)	 0  0 4  4  4 4 7  7          ans is ===> 7