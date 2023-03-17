package Divide_and_Conquer;
public class merge_sort {
	public static void mergeSort(int [] arr,int low,int high) {
		if(low>=high) {
			return;
		}
		int mid=low + (high-low)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	public static void merge(int[] arr,int low,int mid,int high) {
		int[] b=new int[high-low+1];
		int i=low;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=high) {
			if(arr[i]<arr[j]) {
				b[k++]=arr[i++];
			}
			else {
				b[k++]=arr[j++];
			}
		}
		while(i<=mid) {
			b[k++]=arr[i++];
		}
		while(j<=high) {
			b[k++]=arr[j++];
		}
		for(k=0,i=low;k<b.length;k++,i++) {
			arr[i]=b[k];
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {22,11,33,10,14};
		int low=0;
		int high=arr.length-1;
		mergeSort(arr,low,high);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
}
}
//time complexity===>O(nlogn)
//space===>O(n)
//depth first search(DFS)