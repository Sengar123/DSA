package Recursion;
import java.util.*;
public class print_n_to_1 {
	public static void decrease(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		System.out.print(n + " ");
		decrease(n-1);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		decrease(n);
		

	}

}
/*CALL STACK:== when function calls an another function then , call stacks forms
main function(n)------decrease(n)(print n)--------decrease(n-1) (print n-1)-----decrease(n-2)(print n-2)-----
-----and so on---when (n==1) print 1.
stack up(towards the base case) -------stack down(away base case)
STACK OVERFLOW:---> 1.parameter in call is more space taken.
					2.too many recursion call.
that's why base case is important */
