package Stack;
import java.util.*;
public class duplicateParenthesis {

	public static void main(String[] args) {
		Stack<Character> st=new Stack<>();
		String str="(((a+b)+((e+d))(c+d)))";
		
		for(int i=0;i<str.length();i++) {
			char s=str.charAt(i);
			if(s==')') {
				int count=0;
				while((st.peek()!='(')) {
					count++;
					st.pop();
				}
				if(count<1) {
					System.out.println("true");
					return;
				}
				else {
					st.pop();
				}
			}
			else {
				st.push(s);
			}
				
		}
		
		
		System.out.println("false");	

	}

}
//TC====>O(N)
//when you get 
//open bracket or operand or operator---->push
//close bracket===> count variable count the item whether its operator ,operand  and try to find opening pair untill
//count++;
//if count<1 then duplicate exists;