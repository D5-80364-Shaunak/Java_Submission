package com.sortComparator;

import java.util.Comparator;
class sortDoubleComparator implements Comparator<Double>{

	@Override
	public int compare(Double arg0, Double arg1) {
		// TODO Auto-generated method stub
		int diff = arg0.compareTo(arg1);
		return diff;
		
	}
	
}

public class SortCompartorMain {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] arr = {12.4, 15.6, 9.2, 4.4, 23.44};
		sortDoubleComparator c1 = new sortDoubleComparator();
		selectionSort(arr, c1);
		System.out.println("Array after sorting");
		for(Double ele: arr)
			System.out.println(ele);
		}
}
