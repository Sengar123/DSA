package Stack;
import java.util.*;
public class reverse_a_stack {
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top=s.pop();
		reverse(s);
		in(s,top);
	}
	public static void in(Stack<Integer> s,int i) {
		if(s.isEmpty()) {
			s.push(i);
			return;
		}
		int top=s.pop();
		in(s,i);
		s.push(top);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		reverse(s);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
