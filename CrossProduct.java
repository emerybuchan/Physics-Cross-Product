/*
 Summary: This program will take two vectors, and calculate the cross product
 Programmer: Emery Buchan
 Date Completed: November 2, 2017
 */
import java.util.Scanner;
public class CrossProduct {
	
	//initializing the x, y, z components as global variables
	public static int vectorI;
	public static int vectorJ;
	public static int vectorK;
	public static void main (String[] args) {
		//this will take user input from the keyboard
		Scanner input = new Scanner(System.in);
		
		//initializing the array as a 3 by 3 matrix
		int[][] matrix = new int[3][3];

		
		//Ask the user for the matrix values
		System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
		 
		
		//these for loops will run through the matrix and calculate the new vector product.
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length;j++) {
				 
				//taking input from the user and storing it in the matrix array
				matrix[i][j] = input.nextInt();
				 
				
				//The next 10 lines is the calculation of the vector cross product
					int value10 = matrix[1][0];
					int value11 = matrix[1][1];
					int value12 = matrix[1][2];
					int value20 = matrix[2][0];
					int value21 = matrix[2][1];
					int value22 = matrix[2][2];
								
				vectorI = ((value21*value12) - (value11*value22));
				vectorJ = ((value20*value12) - (value10*value22));
				vectorK = ((value20*value11) - (value10*value21));
			}
		}
		//Display the output of the program
		System.out.println("the cross product is: " + vectorI + "i " + vectorJ + "j " + vectorK + "k");
		
	}
}
