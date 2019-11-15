

/*
 * Name:Ely MBAYE
 * Date : 10/15/2019
 * 
 * Teacher: Marcial Cordon
 * 
 */








package backAcount;

import java.util.Scanner;

public class TheFunnyChessMate {

	public static void main(String[] args) {

		//Create a scanner object
		Scanner type = new Scanner(System.in);
        // Initialize and create an array 8 by 2
		int [][] kn = new int [8][2];
		//Print out directions for knight coordinates
		System.out.println("Enter the coordinate of the knight:");
		//Prompt the knight coordinates
		int x= type.nextInt();
		int y = type.nextInt();
		
		//Print out directions the knight coordinates
		System.out.println("Enter the coordinate of the king:");
		// Declare and Prompt the kings coordinates
		int kingX= type.nextInt();
		int kingY= type.nextInt();
		//Initialize index variable for every possible coordinate
		int index1,index2,index3, index4,index5,index6,index7,index8,index9,index10,index11,index12;
		int index13,index14,index15, index16;
		
		//Initialize a flag
		boolean hasCheckmate = false;
		
		
        //Define every possible coordinate
		index1=x-2; index2=y-1;
		index3=x-2;index4=y+1;
		index5=x+2;index6=y-1;
		index7=x+2;index8=y+1;
		index9=x-1;index10=y-2;
		index11=x+1;index12=y-2;
		index13=x-1;index14=y+2;
		index15=x+1;index16=y+2;

       //Assign every coordinate into an array
		kn[0][0]=index1;
		kn[0][1]=index2;
		kn[1][0]=index3;
		kn[1][1]=index4;
		kn[2][0]=index5;
		kn[2][1]=index6;
		kn[3][0]=index7;
		kn[3][1]=index8;
		kn[4][0]=index9;
		kn[4][1]=index10;
		kn[5][0]=index11;
		kn[5][1]=index12;
		kn[6][0]=index13;
		kn[6][1]=index14;
		kn[7][0]=index15;
		kn[7][1]=index16;
        //Print out String to show possible moves
		System.out.print("Possible moves: ");
		
		//for loops to arrange indexes by pair
		for(int i=0; i<kn.length;i++) {
			for(int j=0; j<kn[i].length;j+=2) {
								
				// Check if on board 	
				if(kn[i][j] >=1 && kn[i][j] <= 8 && kn[i][j+1] >=1 && kn[i][j+1] <=8) {
					System.out.print("{" + kn[i][j] + "," + kn[i][j+1] + "} ");
					if (kn[i][j] == kingX && kn[i][j+1]== kingY) {
						hasCheckmate = true;
					}	
				}
				
			}
		}
		// If on board, check if checkmate possible
		if (hasCheckmate) {
			System.out.println("\ncheckmate");
		} else {
			System.out.println("\nno checkmate");
		}
        //Close Scanner
		type.close();


	}

}
