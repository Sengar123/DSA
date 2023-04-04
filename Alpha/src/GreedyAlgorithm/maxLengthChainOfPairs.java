package GreedyAlgorithm;
import java.util.*;
public class maxLengthChainOfPairs {

	public static void main(String[] args) {
		int pairs[][]= {{5,24},{39,60},{5,28},{27,40},{50,90}};
		Arrays.sort(pairs,Comparator.comparingDouble(o->o[0]));
		int ans=1;
		int lastPairEnd=pairs[0][1];
		for(int i=1;i<pairs.length;i++) {
			if(pairs[i][0]>=lastPairEnd) {
				ans++;
				lastPairEnd=pairs[i][1];
			}
		}
		System.out.println(ans);
//O(nlogn)
	}

}
/*you are given n pairs of number.In every pair the first number is always smaller than the second number.
 * A pairs(c,d) can come after pair(a,b) if b<c. find the longest chain which can be formed from a given
 * set of pairs.
 * pairs=(5,24)(39,60)(5,28)(27,40)(50,90)
 * answer=3;
 *sort pairs(based on second number)
 *select first pair
 *
 */