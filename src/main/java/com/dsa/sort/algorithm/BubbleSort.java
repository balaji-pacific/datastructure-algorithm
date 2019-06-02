/**
 * 
 */
package com.dsa.sort.algorithm;

/**
 * @author Balaji
 *
 */
public class BubbleSort {
	
	private static int[] arrayValue = {156, 2, -15, 23, 893, 55, 2, -10, -456};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Bubble Sort");
		System.out.println("--------------");
		
		System.out.println("Before Sorting");		
		for(int i=0;i<arrayValue.length;i++){
			System.out.print(arrayValue[i] + " ");			
		}
		
		for(int unSortedPartation = arrayValue.length-1; unSortedPartation>=0; unSortedPartation--) {
			for(int i=0;i<unSortedPartation;i++) {
				if(arrayValue[i]>arrayValue[i+1]) {
					swap(i,i+1);
				}
			}
		}
		
		System.out.println("\nAfter Sorting");		
		for(int i=0;i<arrayValue.length;i++){
			System.out.print(arrayValue[i] + " ");			
		}
	}
	
	/**
	 * Swaping two number in the array
	 * @param a
	 * @param b
	 */
	public static void swap(int a, int b){
		int temp = arrayValue[a];
		arrayValue[a] = arrayValue[b];
		arrayValue[b] = temp;
	}

}
