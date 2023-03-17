package Recursion;

import java.util.Scanner;

public class last_occ_of_element {
	public static int indexlast(int [] arr,int key,int i) {
		if(i==arr.length-1 && arr[i]!=key) {
			return 0;
		}
		int isfound=indexlast(arr,key,i+1);
		if(isfound==0 && arr[i]==key) {
			return i;
		}
		
		return isfound;
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
		System.out.println(indexlast(arr,key,0));
	}

}
//look forward and then comapre with self