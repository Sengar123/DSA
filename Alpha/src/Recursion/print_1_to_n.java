package Recursion;
import java.util.*;
public class print_1_to_n {
	public static void increase(int n) {
		if(n==1) {
			System.out.print(n + " ");
			return ;
		}
		increase(n-1);
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		increase(n);
	}

}
