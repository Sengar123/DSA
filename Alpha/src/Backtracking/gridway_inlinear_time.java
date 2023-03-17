package Backtracking;
import java.util.*;
public class gridway_inlinear_time {
	public static int fact(int n) {
		int facti=1;
		for(int i=n;i>=1;i--) {
			facti*=i;
		}
		return facti;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int res=fact(n-1+m-1)/(fact(n-1)*fact(m-1));
		System.out.println(res);

	}

}
//(n-1+m-1)!/(n-1)!*(m-1)!
//time complexity---O(n)