package Backtracking;

public class sudoku {
	public static boolean sudokuSolver(int [][] sudoko,int row,int col) {
		if(row==9) {
			
			return true;
		}
		
		int newrow=row,newcol=col+1;
		if(col+1==9) {
			newrow=row+1;
			newcol=0;
		}
		if(sudoko[row][col]!=0) {
			return sudokuSolver(sudoko,newrow,newcol);
		}
		for(int i=0;i<=9;i++) {
			if(issafe(sudoko,row,col,i)) {
				sudoko[row][col]=i;
				if(sudokuSolver(sudoko,newrow,newcol)) {
					return true;
				}
				sudoko[row][col]=0;
			}
			
		}
		return false;
	}
	public static boolean issafe(int [][] sudoko,int row,int col,int i) {
		//row
		for(int j=0;j<9;j++) {
			if(sudoko[row][j]==i) {
				return false;
			}
		}
		//col
		for(int j=0;j<9;j++) {
			if(sudoko[j][col]==i) {
				return false;
			}
		}
		//grid
		int sr=(row/3)*3;
		int sc=(col/3)*3;
		for(int a=sr;a<sr+3;a++) {
			for(int j=sc;j<sc+3;j++) {
				if(sudoko[a][j]==i);{
				return false;
				}
			}
		}
		return true;
	}
	public static void print(int [][] sudoko) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(sudoko[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sudoko[][]= {
				{0,0,8,0,0,0,0,0,0},
				{4,9,0,1,5,7,0,0,2},
				{0,0,3,0,0,4,1,9,0},
				{1,8,5,0,6,0,0,2,0},
				{0,0,0,0,2,0,0,6,0},
				{9,6,0,4,0,5,3,0,0},
				{0,3,0,0,7,2,0,0,4},
				{0,4,9,0,3,0,0,5,7},
				{8,2,7,0,0,9,0,1,3}};
		if(sudokuSolver(sudoko,0,0)) {
			System.out.println("SOLUTION EXIST");
			print(sudoko);
		}
		else {
			System.out.println("SOLUTION NOT EXIST");
		}
		}
	}


