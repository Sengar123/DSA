package Recursion;
import java.util.*;
public class Recursion {
	
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		if(n==0) {
			return 1;
		}
		return n * fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));

	}

}
//time compexity=O(n) space complexity=O(n)
/*Recursion is a method of solving a computational problem where the solution depends on the solution
to smaller instances of the same problems.(similar  calls)
base condition is must in recursion.
travel in two directions.    top to down--- base case----down to up(solution combination)
flow of recursion====> main function call func then func calls again and again to itself and the stop base
case.
condition for recursion:-
1.Base case
2.work in current function
3.call inner function , inner function works properly




*/