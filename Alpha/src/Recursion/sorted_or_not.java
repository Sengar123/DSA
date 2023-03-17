package Recursion;
import java.util.*;

public class sorted_or_not {
	
	public static boolean issorted(int arr[],int i) {
		
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i]>arr[i+1]) {
			return false;
		}
		return issorted(arr,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			int n=sc.nextInt();
			int [] arr=new int[n];
			for(int j=0;j<n;j++) {
				arr[j]=sc.nextInt();
			}
		System.out.println(issorted(arr,0));
		}
	}

}
//time complexity----> O(n)          space complexity-----> O(n)
