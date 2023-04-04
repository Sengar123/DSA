package Stack;
import java.util.*;
public class push_at_bottom_of_stack {
	public static void insert(Stack<Integer> st,int i) {
		if(st.isEmpty()) {
			st.push(i);
			return;
		}
		int top=st.pop();
		insert(st,i);
		st.push(top);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		insert(s,4);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
//O(n)---->Recursion