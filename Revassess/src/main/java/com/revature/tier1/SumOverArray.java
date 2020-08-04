package com.revature.tier1;


/**
 * prompt:
 * Create a method that iterates 
 * over an integer array and returns 
 * their sum.
 */
public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		int sum = 0;
		
		try {
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return sum;
	}
}
