package Array;

public class pairrs_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  arr= {2,4,5,6,7};
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.print("(" + arr[i] + "," +arr[j] + ")");
				c++;
			}
			System.out.println();
		}
		System.out.println("NO. OF PAIRS " + c);
		//n(n-1)/2;   no. of pairs
		//O(n^2) ----> time complexity

	}

}
