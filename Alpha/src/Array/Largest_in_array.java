package Array;

public class Largest_in_array {
	public static int largest(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int smallest(int[] arr) {
		int min=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {66,90,999,80,07,666};
		
		System.out.println("THE LARGEST ELEMENTS IN THE ARRAY " + largest(arr));
		System.out.println("THE SMALLEST ELEMENTS IN THE ARRAY " + smallest(arr));
//- Integer.MIN_VALUE---> -INFINITY                          Integer.MAX_VALUE-----> +INFINITY
	}

}
