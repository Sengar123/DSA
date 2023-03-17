package Recursion;
import java.util.*;
public class first_occ_of_element {
	public static int index(int [] arr,int key,int i) {
		if(i==arr.length-1 && arr[i]!=key) {
			return 0;
		}
		if(arr[i]==key) {
			return i;
		}
		
		return index(arr,key,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		System.out.println(index(arr,key,0));
	}

}
//time complexity----> O(n)            space complexity---->O(n)
