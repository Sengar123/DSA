package GreedyAlgorithm;
import java.util.*;
public class JobSequencing {
	static class job{
		int deadline;
		int profit;
		int id; 
		job(int i,int d,int p){
			id=i;
			deadline=d;
			profit=p;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [][] job= {{4,20},{1,10},{1,40},{1,30}};
		ArrayList<job> jobs=new ArrayList<>();
		Arrays.sort(job,Comparator.comparingDouble(o->o[1]));
		int time=0;
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=job.length-1;i>=0;i--) {
			jobs.add(new job(i,job[i][0],job[i][1]));
		}
		int pr=0;
		Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);//descending order
		for(int i=0;i<jobs.size();i++) {
			job curr=jobs.get(i);
			if(curr.deadline>time) {
				a.add(curr.id);
				pr+=curr.profit;
				time++;
			}
		}
		System.out.println("max job" + " "+ a.size());
		System.out.println(a);
		System.out.println("max profit" +" " + pr);
		
	}

}
/* Job A=4(deadline),20(profit)
 * Job B=1,10
 * Job C=1,40
 * Job D=1,30
 * totalprofit=(C,A)
 * sort jobs(based on profit)
 */
