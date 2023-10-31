/*Write a generic static method to ﬁnd minimum from an array of Number. */
package com.minimum;

public class FindMinimumMain {
	public static <T extends Number> T getMinimum(T[] arr) {
		
	T minVal = arr[0];
	for(int i = 1; i <arr.length; i++) {
		if(minVal.doubleValue() > arr[i].doubleValue()) 
			minVal = arr[i];
		
		}
	return minVal;
	
  }
}