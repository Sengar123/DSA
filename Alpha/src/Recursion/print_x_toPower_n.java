package Recursion;
import java.util.Scanner;
public class print_x_toPower_n {
	
	public static int power(int x,int n) {
		//complexity===>O(n)
		if(n==1) {
			return x;
		}
		return x * power(x,n-1);
	}
	public static int optimise_power(int x,int n) {
		//time complexity===> O(logn)
		if(n==0) {
			return 1;
		}
			int ans=optimise_power(x,n/2);
			int res= ans*ans;
		
		if(n%2!=0) {
			res=  x*res;
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(power(x,n));
		System.out.println(optimise_power(x,n));
	}

}
