package Array;

import java.util.Stack;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {66,90,999,80,07,666};
		int [] arr1=new int [6];
//		int j=6;
//		for(int i=0;i<6;i++) {
//			arr1[j-1]=arr[i];
//			j=j-1;
//		}
//		for(int i=0;i<6;i++) {
//			System.out.print(arr1[i] + " ");
//		}
		
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i] + " ");
//		}
		
		Stack sk=new Stack();
		for(int i=0;i<6;i++) {
			sk.push(arr[i]);
		}
		for(int i=0;i<6;i++) {
			System.out.print(sk.pop() + " ");
		}
		
		
	}

}
