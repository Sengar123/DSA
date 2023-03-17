package ArrayList;
//2-pointer approach
import java.util.ArrayList;
//sorted array
public class pairSum1_optimise {
	public static boolean check(ArrayList<Integer> list,int t) {
		int left=0;
		int right=list.size()-1;
		while(left<=right) {
			if((list.get(left)+list.get(right))==t) {
				System.out.println("("+list.get(left)+","+list.get(right)+")");
				return true;
			}
			else if((list.get(left)+list.get(right))<t) {
				left+=1;
			}
			else {
				right-=1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		int t=3;
		System.out.println(check(list,t));
	}
//time complexity====O(n)
}
