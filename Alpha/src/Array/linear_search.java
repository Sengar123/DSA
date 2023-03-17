package Array;
import java.util.*;
public class linear_search {
	public static void linear_s(String [] arr,String k) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				System.out.println("element at index" + i);
				c=1;
				break;
			}
		//time complexity=O(n)	
		}
		if(c==0) {
			System.out.println("element not found");
		}
	}
	public static void binary_s(int[] arr,int k) {
		int n=arr.length;
		int a=0;
		int kkk=0;
		int kk=0;
		
		while(a<n) {
		//time complexity=O(logn)
			int mid=(n+a)/2;
		if(arr[mid]==k) {
			System.out.println("element at index" + mid);
			kk=1;
			break;
		}
		else if(arr[mid]>k) {
			n=mid-1;
		}
		else {
			a=mid+1;
		}
		
		}
		if(kk==0) {
			System.out.println("element not found");
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {11,22,33,44};
		int k=44;
		int aa=50;
		int [] arr2= {88,90,99};
		int k1=99;
		int aa1=990;
//		linear_s(arr1,k);
//		linear_s(arr1,aa);
		binary_s(arr2,k1);
		binary_s(arr2,aa1);
		String [] ar= {"mango","orange","apple"};
		String ch="guava";
		linear_s(ar,ch);
		
		
		

	}

}
