package ArrayList;

import java.util.ArrayList;

public class container_with_most_water_optimisation {
	public static int storeWater(ArrayList<Integer> list) {
		int n=list.size();
		int maxwater=0,currwater=0;
		int h=0,b=0;
		int left=0;
		int right=n-1;
		while(left<right) {
		h=Math.min(list.get(left),list.get(right));
		b=Math.abs(left-right);
		currwater=h*b;
		maxwater=Math.max(maxwater,currwater);
		if(list.get(left)<list.get(right)) {
			left+=1;
		}
		else {
			right-=1;
		}
		
		}
		return maxwater;
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
		System.out.println(storeWater(list));
	}

}
