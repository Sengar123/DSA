package Backtracking;

import java.util.Scanner;

public class pRINT_ONE_SOL_OF_N_queen {
	public static boolean nQueen(char[][] board,int i) {
		if(i==board.length) {
			
			return true;
		}
		int c=0;
		for(int a=0;a<board.length;a++) {
			if(issafe(board,i,a)) {
				board[i][a]='Q';
				if(nQueen(board,i+1)) {return true;
				
				}
				board[i][a]='X';
				
			}
			
			
		}
		return false;
		
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
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[][] board=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='X';
			}
		}
		if(nQueen(board,0)) {
		System.out.println("SOLUTION EXITS");
		print(board);
		}
		else {
			System.out.println("SOLUTION NOT EXITS");
		}
	}

}
