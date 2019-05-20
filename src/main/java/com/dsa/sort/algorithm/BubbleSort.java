/**
 * 
 */
package com.dsa.sort.algorithm;

/**
 * @author Balaji
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arrayValue = {156, 2, -15, 23, 893, 55, 2, -10, -456};
		
		System.out.println("Before Sorting : ");
		
		for(int i=0;i<arrayValue.length; i++) {
			System.out.print(arrayValue[i] + " ");
		}
		
		for(int unsort=arrayValue.length - 1; unsort >= 0; unsort --) {
			for(int i=0;i<=unsort-1;i++) {
				if(arrayValue[i] > arrayValue[i+1]) {
					int temp = arrayValue[i];
					arrayValue[i] = arrayValue[i + 1];
					arrayValue[i + 1] = temp;
				}
			}
		}
		
		System.out.println("\nAfter Sorting : ");
		for(int i=0;i<arrayValue.length; i++) {
			System.out.print(arrayValue[i] + " ");
		}
		
	}

}
