package Array;

public class Array_As_Argument {
	public static void update(int arr[],int val) {
		for(int i=0;i<arr.length;i++) {
			arr[i]+=1;
			
		}
		val=10;
	}
	public static void main(String [] args) {
		int arr[]= {1,2,3,4};
		int val=111;
		update(arr,val);
		System.out.println(val);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
			
		}
		
		
		
	}

}
