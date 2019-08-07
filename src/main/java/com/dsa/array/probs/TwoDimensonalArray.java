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

	private static Scanner scanner;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] matrixA = new int[10][10];		
		int[][] matrixB = new int[10][10];
		int[][] outputMatrix = new int[10][10];
		int row = 0;
		int column = 0;
		
		scanner = new Scanner(System.in);
		System.out.print("Enter size of the row : ");
		row = scanner.nextInt();
		System.out.print("Enter size of the column : ");
		column = scanner.nextInt();
		System.out.println("Enter totally for Matrix A " + row*column + " values");
		for(int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.print("Enter value for " + i + "*" + j + " : " );
				matrixA[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter totally for Matrix B " + row*column + " values");
		for(int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.print("Enter value for " + i + "*" + j + " : " );
				matrixB[i][j] = scanner.nextInt();
			}
		}
		
				
		System.out.println("Matrix A: ");
		for(int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.print(matrixA[i][j] + " ");				
			}
			System.out.println("");
		}
		
		System.out.println("Matrix B: ");
		for(int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.print(matrixB[i][j] + " ");				
			}
			System.out.println("");
		}
		
		for(int i =0; i<row; i++) {
			for(int j=0; j<column; j++) {
				outputMatrix[i][j] = matrixA[i][j] + matrixB[i][j];				
			}			
		}
		
		System.out.println("Output Matrix: ");
		for(int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.print(outputMatrix[i][j] + " ");				
			}
			System.out.println("");
		}
		
	}

}
