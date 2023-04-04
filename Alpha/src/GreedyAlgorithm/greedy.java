package GreedyAlgorithm;
import java.util.*;
/*
ACTIVITY SELECTION PROBLEM
u r given n activities with their start and end times.Select the maximum number of activities that 
can be performed by a single person assuming a person can only work on a single activity at a time,
Activities are sorted according to end time.
start=[10,12,20]  end=[20,25,20]==========> ans ==2(AO AND A2)
*/
public class greedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] start= {1,3,0,5,8,5};
		int[] end= {2,4,6,7,9,9};
		//when end is not sort
		/*
		 int[][] activities=new int[start.length][3];
		 for(int i=0;i<start.length;i++){
		 activities[i][0]=i;
		 Activities[i][1]=start[i];
		 activities[i][2]=end[i];
		 
		 }
		 lambda function====>short form of function
		 Arrays.sort(activities,Comparator.compareDouble(o->o[2]));
		 sort array bu index 2;
		 last=activities[0][2]
		 ans.add(activities[0][0])
		 start[i]==activities[i][1]
		 ans.add(i)==ans.add(activities[i][0])
		 end[i]=activities[i][2]		 */
		int max=0;
		ArrayList<Integer> ans=new ArrayList<>();
		//1st activity
		max=1;
		ans.add(0);
		int last=end[0];
		for(int i=1;i<start.length;i++) {
			if(last<=start[i]) {
				ans.add(i);
				max++;
				last=end[i];
			}
		}
		System.out.println(max);
		System.out.println("SELECTED ACTIVITIES ARE " + " "+ ans) ;
		
		

	}

}
//end time basis sorted
//select activity0
//Activity0 ka end time non overlapping(disjoint)  start time>=last chosen selected end time;
/*
optimisation it check for some result not for all results
no fixed approach
Adhoc concept----> jis tarah ka problem wesa solutions.
greedy  algo is the problem solving technique where we make the locally optimum choice at each stage and hope
to achieve a global optimum
simple and easy to understand,good enough time complexity(ADVANTAGES)
a lot of time ,global optimum is not achieved(DISADVANTAGE)
*/