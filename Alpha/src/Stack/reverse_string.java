package Stack;
import java.util.*;
public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st=new Stack<>();
		String s="hello";
		for(int i=0;i<s.length();i++) {
			st.push(s.charAt(i));
			
		}
//		while(!st.isEmpty()) {
//			System.out.print(st.pop()+" ");
//		}
		StringBuilder ss=new StringBuilder();
		while(!st.isEmpty()) {
			ss.append(st.pop());
		}
		System.out.print(ss.toString());
	}

}
