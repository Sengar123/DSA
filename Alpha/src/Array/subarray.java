package Array;

public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  arr= {2,4,5,6,7};
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
//				System.out.print("[" + arr[i] + "," +arr[j] + "]");
				System.out.print("[" + arr[k] + "]");
				}
				c++;
				System.out.println();	
			}
			System.out.println();
		}
		//n(n+1)/2;
		System.out.println("total no. of sub array " + c);
	}

}
