package Divide_and_Conquer;

public class search_in_rotated_sorted_array {
	public static int search(int [] arr,int target,int low,int high) {
		if(low>=high) {
			return -1;
		}
		int mid=low+(high-low)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[low]<=arr[mid]) {
			if(arr[low]<=target && target <=arr[mid]) {
				 return search(arr,target,low,mid-1);
			}
			else {
				return search(arr,target,mid+1,high);
			}
		}
		else {
			if(arr[mid]<=target && target<=arr[high]) {
				return search(arr,target,mid +1,high);
			}
			else {
				return search(arr,target,low,mid-1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,5,6,7,0,1,2};
		int target=2;
		System.out.println(search(arr,target,0,arr.length-1));

	}

}
//modified binary search
/* Case 1:mid on L1(arr[low]<=arr[mid])
case a: L1 left(low<=target<=mid)
case b: mid right (else)
case 2: mid on L2(mid<=arr[high])
case c:L2 right (arr[mid]<=target<=arr[high])
case d: mid left (else)
*/