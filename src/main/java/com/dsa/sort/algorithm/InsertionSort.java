/**
 * 
 */
package com.dsa.sort.algorithm;

/**
 * @author Balaji
 *
 */
public class InsertionSort {
	
	private static int[] arrayValue = {3456, 156, 2, -15, 23, 893, 55, 2, -10, -456};

	/**
	 * Insertion Sort Algorithm Technique
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Insertion Sort Algorithm");
		System.out.println("------------------------");
		
		System.out.println("Before Sorting");
		for(int i=0; i<arrayValue.length; i++) {
			System.out.print(arrayValue[i] + " ");
		}
		
		for(int unSortedPartation=1; unSortedPartation<arrayValue.length; unSortedPartation++) {
			
			int newElement = arrayValue[unSortedPartation];
			
			int i;
			
			for(i=unSortedPartation; i>0 && arrayValue[i-1]	> newElement; i--) {
				arrayValue[i] = arrayValue[i-1];
			}
			
			arrayValue[i] = newElement;
			
		}
		
		
		System.out.println("\nAfter Sorting");
		for(int i=0; i<arrayValue.length; i++) {
			System.out.print(arrayValue[i] + " ");
		}
		
	}

}
