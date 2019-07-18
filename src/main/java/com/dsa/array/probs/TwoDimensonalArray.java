/**
 * 
 */
package com.dsa.array.probs;

import java.util.Scanner;

/**
 * @author bsounda
 *
 */
public class TwoDimensonalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] matrix = new int[10][10];		
		int row = 0;
		int column = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of the row : ");
		row = scanner.nextInt();
		System.out.print("Enter size of the column : ");
		column = scanner.nextInt();
		System.out.println("Enter totally  " + row*column + " values");
		for(int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.print("Enter value for " + i + "*" + j + " : " );
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		
		System.out.println("Output : ");
		for(int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.print(matrix[i][j] + " ");				
			}
			System.out.println("");
		}
		
	}

}
