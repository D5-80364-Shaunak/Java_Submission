package com.maxlength;

import java.util.*;

public class MaxLengthString {

	public static void main(String[] args) {
		List<String> strList = new LinkedList<String>();
		strList.add("Abarakadabra");
		strList.add("Agnirathgamanagamanbhaysuchaklohatamrapattika");
		strList.add("shrishankarchennaswamimutthuswamivenugopalayyer");
		strList.add("ok");
		
		@SuppressWarnings("unused")
		class StringLengthComp implements Comparator<String>{
			@Override
			public int compare(String s1, String s2) {
				int comp = s1.length() - s2.length();
				return comp;
			}
		}
		String maxEle = Collections.max(strList, new StringLengthComp());
		System.out.println("The longest string is :" + maxEle);
	}

}
