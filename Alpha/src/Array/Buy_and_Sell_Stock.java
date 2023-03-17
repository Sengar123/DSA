package Array;

public class Buy_and_Sell_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {7,1,5,3,6,4};
		int profitmax=0;
		int buyingprice=Integer.MAX_VALUE;
		int profit=0;
		for(int i=0;i<arr.length;i++) {
			if(buyingprice<arr[i]) {
				profit=arr[i]-buyingprice;
				if(profit>profitmax) {
					profitmax=profit;
				}
			}
			else {
				buyingprice=arr[i];
			}
		}
		System.out.println(profitmax);

	}
	//compexity====>O(n)

}
