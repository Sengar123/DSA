package Array;
import java.util.*;
public class Trapping_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,0,6,3,2,5};
		int[] leftmax=new int[arr.length];
		int[] rightmax=new int[arr.length];
		leftmax[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			
				leftmax[i]=Math.max(leftmax[i-1],arr[i]);
			
		}
		rightmax[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			rightmax[i-1]=Math.max(rightmax[i],arr[i-1]);
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			int water_level=Math.min(leftmax[i],rightmax[i]);
			sum+=(water_level-arr[i]);
		}
		System.out.println(sum);

	}

}
//height of different bars are given in the form of array {4,2,0,6,3,2,5}  width of each bar is 1.
//trap water=(water level-height of bar)* width
//               4     2     0     6     3     2      5
//stored water   0   (4-2)   (4-0)  0    (5-3) (5-2)  (5-5)
//               0  +  2   +  4   + 0   +  2 +  3 +0=====> 11
//conditions for water level 1. no. of bars > 2
// 2. ascending or desc leads no water trap.
// water level=min(maxleft,maxright)
//use auxiliary array or helper function
//left max boundary    4 4 4 6 6 6 6
//right max boundary   6 6 6 6 5 5 5
//complexity is O(n).
