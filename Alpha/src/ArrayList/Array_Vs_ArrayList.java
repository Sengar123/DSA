package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Array_Vs_ArrayList {
	public static void swap(ArrayList<Integer> list,int idx1,int idx2) {
		int temp=list.get(idx1);
		list.set(idx1,list.get(idx2));
		list.set(idx2,temp);
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JAVA COLLECTION FRAMEWORKS
		ArrayList<Integer> list=new ArrayList<>();
		//Integer,Character,Boolean,Float
		ArrayList<String> list1=new ArrayList<>();
		ArrayList<Boolean> list2=new ArrayList<>();
		//add element===O(1);
		list.add(56);
		list.add(90);
		list.add(67);
		list.add(52);
		list.add(1,9);//take O(n)
		System.out.println(list);
		/*
		get element===O(1)
		System.out.println(list.get(3));
		remove elements===O(n)
		list.remove(2);
		System.out.println(list);
		set element at index===O(n)
		list.set(2,10);
		System.out.println(list);
		contains elements===O(n)
		System.out.println(list.contains(10));
		System.out.println(list.contains(91));
		SIZE 
		reverse 
		System.out.println(list.size());
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+ " ");
		}
		*/
		
		
		
/*		//FIND MAXIMUM IS A ARRAYLIST:
		int max=Integer.MIN_VALUE;
		for(int i=0;i<list.size();i++) {
			if(max<list.get(i)) {
				max=list.get(i);
			}
			max=Math.max(max,list.get(i));
		}
		System.out.println(max);
		*/
		
		
		//SWAPPING OF TWO NUMBER:
		//swap(list,2,3);
		
		
		//SORTING
		Collections.sort(list); //collections-->class and sort--->method   ascending order
		System.out.println(list);
		//in descending order
		Collections.sort(list,Collections.reverseOrder());
		// reverseOrder() is a comparator ====find logic
		System.out.println(list);
		
	}
	

}
//ARRAYS===> fixed size,primitive data types can be stored
//ARRAYLIST===> dynamic size, primitive data types cannot be stored directly
