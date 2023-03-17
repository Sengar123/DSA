package Backtracking;

public class Array_Backtrack {
	public static void change(int[] arr,int index,int value_at_index) {
		if(index==arr.length) {
			print(arr);
			return;
		}
		arr[index]=value_at_index;
		change(arr,index+1,value_at_index+1);
		arr[index]=arr[index]-2;//backtracking
	}
	public static void print(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		change(arr,0,1);
		print(arr);
		
		
	}

}
//O(n) ---->time complexity    space complexity===> O(n)
//optimisation, enumeration, decision