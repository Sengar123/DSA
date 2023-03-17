package Recursion;
import java.util.*;
public class remove_duplicates_in_string {
	public static void duplicates(String str,int idx,StringBuilder newstr,boolean map[]) {
		if(idx==str.length()) {
			System.out.println(newstr);
			return;
		}
		char ch=str.charAt(idx);
		if(map[ch-'a']==true) {
			duplicates(str,idx+1,newstr,map);
		}
		else {
			map[ch-'a']=true;
			duplicates(str,idx+1,newstr.append(ch),map);
		}
		
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		boolean [] map=new boolean[26];
		duplicates(str,0,new StringBuilder(""),map);

	}

}
//new string===new string contains all unique value
//id===>shows current character index
//arrays===> contains all duplicates having 26  character size boolean type.
/*'a'-'a'-->0
'b'-'a'-->1
'c'-'a'-->2
.
.
.
'z'-'a'-->25*/
//base=idx=str.length()-1
//kaam--> char present hai map me then ignore otherwise add
//next call--> idx=idx=1