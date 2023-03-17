package Backtracking;
import java.util.*;
public class find_subsets {
	public static void find_subset(String str,String ans,int index) {
		if(index==str.length()) {
			if(ans.length()==0) {
				System.out.println("null");
			}
			else {
			System.out.println(ans);}
			return;
		}
			
		//recursion
		//yes choice
			find_subset(str,ans+str.charAt(index),index+1);
		//no choice
		find_subset(str,ans,index+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		System.out.println("Total subset of the string");
		int a=(int) Math.pow(2,str.length());
		System.out.println(a);
		System.out.println("Subsets of the string are :");
		String ans="";
		find_subset(str,ans,0);
	}

}
//time complexity---> O(n * 2^n)    space complexity---->O(n)
