package GreedyAlgorithm;
import java.util.*;
public class IndianCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1059;
		int totalcoins=0;
		Integer [] coins={1,2,5,10,20,50,100,500,2000};
		Arrays.sort(coins,Comparator.reverseOrder());
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<coins.length;i++) {
			if(coins[i]<=n) {
				while(coins[i]<=n) {
					totalcoins++;
					n-=coins[i];
					a.add(coins[i]);
				}
			}
		}
		System.out.println(totalcoins);
		System.out.println(a);
		
	}

}
/*
 * {1,2,5,10,20,50,100,500,2000}
 * minimum no. of coins/notes to make changes of value v
 * v=121
 *answer=3(100*20+1)
 *v=590
 *answer=4(500+50+20+20)
 *canonical number system
 */
