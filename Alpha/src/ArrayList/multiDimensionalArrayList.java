package ArrayList;
import java.util.*;
public class multiDimensionalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		mainlist.add(list);
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(8);
		list1.add(9);
		list1.add(7);
		list1.add(5);
		list1.add(99);
		mainlist.add(list1);
		for(int i=0;i<mainlist.size();i++) {
			ArrayList <Integer> aa=mainlist.get(i);
			for(int j=0;j<aa.size();j++) {
				System.out.print(aa.get(j)+ " ");
			}
			System.out.println();
		}
		System.out.println(mainlist);
		
	}

}
