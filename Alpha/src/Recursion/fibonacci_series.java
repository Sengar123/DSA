package Recursion;

import java.util.Scanner;

public class fibonacci_series {
	
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));

	}

}
//0 1 1 2 3 5 8 
//time complexity---> O(2^n)   space complexity---->O(n)