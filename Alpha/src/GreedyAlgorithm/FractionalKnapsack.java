package GreedyAlgorithm;
import java.util.*;
public class FractionalKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] profit= {60,100,120};
		int[] items= {10,20,30};
		int max=50;
		double ratio[][]=new double[profit.length][2];
		//0th col=index;
		//1st col=item ratio
		for(int i=0;i<profit.length;i++) {
			ratio[i][0]=i;
			ratio[i][1]=profit[i]/(double)items[i];
		}
		int capacity=max;
		int profitmax=0;
		Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
		for(int i=ratio.length-1;i>=0;i--) {
			int idx=(int)ratio[i][0];
			if(capacity>=items[idx]) {//full select
				profitmax=profitmax+profit[idx];
				capacity=capacity-items[idx];
			}
			else {
				profitmax+=(int) (ratio[i][1]*capacity);
				capacity=0;
				break;
			}
		}
		System.out.println(profitmax);

	}

}
/*
profit=[60,100,120]
item=[10,20,30]
		max=50 
		total profit=240
calculate profit/item=ratio=[6,5,4]

*/