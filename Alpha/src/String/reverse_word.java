package String;
import java.util.*;
public class reverse_word {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str= "my father is best";
//		String [] arr=str.split(" ");
//		StringBuilder sb=new StringBuilder();
//		for(int i=arr.length-1;i>=0;i--) {
//			if(arr[i].length()>0) {
//				sb.append(arr[i]+" ");
//			}
//		}
//		System.out.println(sb.toString().trim());
		ArrayList<Integer> ll=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<7;i++) {
			int n=sc.nextInt();
			ll.add(n);
		}
		
			System.out.println(ll);
		int sum=0;
		ArrayList<Integer> ll1=new ArrayList<>();
		for(int i=0;i<7;i++) {
			sum+=ll.get(i);
			ll1.add(sum);
		}
		System.out.println(ll1);
	}

}
