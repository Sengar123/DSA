package ArrayList;

import java.util.ArrayList;

public class pairSum1 {
	public static boolean res(ArrayList<Integer> list, int target) {
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				if((list.get(i)+list.get(j))==target) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(3);
		list.add(7);
		System.out.println(list);
		int target=17;
		System.out.println(res(list,target));

	}

}
