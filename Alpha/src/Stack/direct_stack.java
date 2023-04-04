package Stack;
import java.util.*;
public class direct_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jsf
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(8);
		s.push(7);
		s.push(4);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

}
