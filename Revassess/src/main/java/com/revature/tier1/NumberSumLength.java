package com.revature.tier1;

/**
 * prompt:
 * Create a method that, given an integer, can 
 * raise each digit to the power of the overall 
 * length and return whether the sum of the powers 
 * is equal to the original integer.
 */
public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		String longNumber = Long.toString(num);
		char[] cArr = longNumber.toCharArray();
		double[] iArr = new double[cArr.length];
		double value = 0;
		
		
		for (int i = 0; i < iArr.length; i++) {
			
			iArr[i] = Double.parseDouble(Character.toString(cArr[i]));
			iArr[i] = Math.pow(iArr[i], iArr.length);
			value += iArr[i];
		}
		if (value == num) {
			return true;
		} else
			return false;
	}
}
