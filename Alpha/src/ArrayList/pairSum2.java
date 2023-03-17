package ArrayList;
import java.util.*;
//pivot point (breaking) when my sorted arrays breaks.
//sorted and rotated----->>>>

public class pairSum2 {
	public static boolean check(ArrayList<Integer> list,int t,int i) {
		int left=i+1;
		int right=i;
		while(left!=right) {
			if((list.get(left)+list.get(right))==t) {
				System.out.println("("+list.get(left)+","+list.get(right)+")");
				return true;
			}
			else if((list.get(left)+list.get(right))<t) {
				left=(left+1)%list.size();
			}
			else {
				right=(list.size()+right-1)%list.size();
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(15);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
		int j=0;
		int t=100;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>list.get(i+1)) {
				j=i;
				break;
			}
		}
		System.out.println(check(list,t,j));
		
	}

}
//modular arithmetic
// 11,15, 6,8,9,10
//O(n)----->TIME COMPLEXITY