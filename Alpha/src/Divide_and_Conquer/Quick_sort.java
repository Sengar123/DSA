package Divide_and_Conquer;

public class Quick_sort {
	public static void Quicksort(int [] arr,int low,int high) {
		if(low>=high) {
			return;
		}
		int pivot_idx=partition(arr,low,high);
		Quicksort(arr,low,pivot_idx-1);//left parts
		Quicksort(arr,pivot_idx+1,high);//right parts
	}
	public static int partition(int[] arr,int low,int high) {
		int pivot=arr[high];
		int i=low-1;//to make place for element which is smaller than pivot
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		//for right position for swap
//		i++;
//		int temp=pivot;
//		arr[low]=arr[i];
//		arr[i]=temp;
//		return i;
		int temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;
	    return (i + 1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {33,44,22,10,3,2,-2};
		Quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		

	}

}
//avrg time complexity===>O(nlogn)
//worst time complexity===>O(n^2)
//pivot(last element)
//partition(parts)
//worst case when pivot is largest element of array when ascending order and when pivot is smallest elements of array
//when descending order
//quicksort(left)   quicksort(right)
/* 				6  3  9  8  2  5    pivot 5
				3  2  5  6  8  9		   
				









*/