package com.GenericFunctionalInterface;

public class Solution {
	interface Check<T>{
		boolean compare(T x, T y);
	}
	
	static <T> int countIf(T[] arr, T key, Check<T>c) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(c.compare(arr[i], key)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt);

	}

}
