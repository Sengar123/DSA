
package Backtracking;
import java.util.*;
public class gridWays {
	public static int gridWay(int i,int j,int n,int m) {
		if(i==n-1 && j==m-1) {
			return 1;
		}
		if(i==n || j==n) {
			return 0;
		}
		int w1=gridWay(i+1,j,n,m);
		int w2=gridWay(i,j+1,n,m);
		return w1+w2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(gridWay(0,0,n,m));
	}

}
//time complexity----> O(2^(n+m))
