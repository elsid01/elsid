package tic.tac.toe.PACKAGE;

import java.util.Scanner;

public class TheTicTacToeGame {

	public static void main(String[] args) {

		Scanner type = new Scanner(System.in);
		System.out.println("Enter the row number and "
				+ "the column number you opt to play on: ");
		char [][] grid = new char [3][3];
		String name;
		for(int i=0; i<grid.length; i++) {
			for(int j = 0; j<grid[i].length; j++) {
				grid[i][j]='-';
			}
		}
		String string=type.next();
		int row=Integer.parseInt(string.substring(0,1));
		int col=Integer.parseInt(string.substring(1,2));
		
		grid[row][col]='x';
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
			 /* System.out.println("Play");
		      name = type.next();
		      System.out.println(name);*/
		}
        

	

}
