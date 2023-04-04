package Stack;
import java.util.*;
public class validParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st=new Stack<>();
		String str="({[]})";
		for(int i=0;i<str.length();i++) {
			char s=str.charAt(i);
			if(s=='(' || s=='{' ||s=='[') {
				st.push(s);
			}
			else{
				if(st.isEmpty()) {
					System.out.println("false");
				}
				if((st.peek()=='(' && s==')')||(st.peek()=='{' && s=='}')||(st.peek()=='[' && s==']')) {
					st.pop();
				}
				else {
					System.out.println("false");
				}
			}
		}
		if(st.isEmpty()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
//open bracket must be closed by the same types of brackets.
//open brackets must be closed in correct order
//every close bracket has a corresponding open bracket of the same type
//TC===> O(N)
//opening bracket===push into the stack
//closing bracket===> if s.peek making pair with  it if yes then okay and pop otherwise 