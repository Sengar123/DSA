package Backtracking;
import java.util.*;
public class permutation {
	public void permutations(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char curr=str.charAt(i);
			String newstr=str.substring(0,i) + str.substring(i+1);
			permutations(newstr,ans+curr);
		}
	}
//time complexity O(n*n!)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans="";
		permutation p=new permutation();
		p.permutations(str,ans);
		
		
			
		

	}

}
