package GreedyAlgorithm;
import java.util.*;
public class minAbsoluteDifferencePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,1,8,7};
		int [] arr1= {2,3,6,5};
		Arrays.sort(arr);
		Arrays.sort(arr1);
		int sum=0;
		//O(nlogn)
		for(int i=0;i<arr.length;i++) {
			sum+=Math.abs(arr[i]-arr1[i]);
		}
		System.out.println(sum);
		

	}

}
/*
pair each element of arrayA to an element in arrayB such that sum of S absolute 
differences of all the pairs is minimum.
A=[1,2,3]
B=[2,1,3]
		case 1=|1-2|+|2-1|+|3-3|=2
		case 2=|1-3|+|2-1|+|3-2|=4
		case 3=|1-1|+|2-2|+|3-3|=0
*/