package Recursion;

public class binary_string_problem {
	public static void print(int n,int lastplace,String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		print(n-1,0,str+"0"); //place 0
		if(lastplace==0) {
			
			print(n-1,1,str+"1"); //place 1
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(3,0,"");

	}

}
//print all binary string that does not contain all consecutive 1's'
//n==0 empty string
//n==1 return either '1' , '0'.
//n==2 return "00" "01" "10"
//last place =1 then dont place 1
//if last place ==0 then place 1 or 0
