package Backtracking;
import java.util.*;
public class n_queen {
	public static void nQueen(char[][] board,int i) {
		if(i==board.length) {
			print(board);
			return;
		}
		
		for(int a=0;a<board.length;a++) {
			if(issafe(board,i,a)) {
				board[i][a]='Q';
				nQueen(board,i+1);
				board[i][a]='X';
				
			}
			
			
		}
		
	}
	public static boolean issafe(char[][] board,int row,int col) {
		//upper col
		for(int i=row-1;i>=0;i--) {
			if(board[i][col]=='Q') {
				return false;
			}
		}
		//for left up diagonal
		for(int i=row-1,j=col-1 ;i>=0 && j>=0;j--,i--) {
			if(board[i][j]=='Q') {
				return false;
			}
		}
		//for right up diagonal
		for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
			if(board[i][j]=='Q') {
				return false;
			}
		}
		return true;
	}
	public static void print(char[][] board) {
		System.out.println("------------CHESS BOARD---------------");
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+ " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[][] board=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='X';
			}
		}
		nQueen(board,0);

	}

}
//all solution //yea/no if yes then find one//count solution
//TIME COMPLEXITY=O(N!)