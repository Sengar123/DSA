package Recursion;
import java.util.*;
public class tiling_problem {
	
	public static int number_tiles(int n) {
		if(n==0 ||n==1) {
			return 1;
		}
		//kaam
		//vertical choice
		int verticaltiles=number_tiles(n-1);
		//horizontal choice
		int horizontaltiles=number_tiles(n-2);
		int totalways=verticaltiles + horizontaltiles;
		return totalways;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(number_tiles(n));
		

	}

}
//2*n -->board
//size of one tile---> 2*1
//count no. of ways that tiles can arrange into the board(whether horizontal or vertical).--->?
 