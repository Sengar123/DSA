package Recursion;
import java.util.*;
public class friends_pairing_problem {
	public static int ways(int n) {
		if(n==1 || n==2) {
			return n;
		}
		//single 
		int pair1=ways(n-1);
		//pair
		int pair2= (n-1) * ways(n-2);
				//pair choice=n-1
				//ways(n-2)=1 pair ways
		int total=pair1+pair2;
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(ways(n));
	}

}
// n friend
//can be in pair or single, a person can only make one pair
//total number of ways in which friends can remain single or can be paired up