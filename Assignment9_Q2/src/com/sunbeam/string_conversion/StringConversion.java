package com.sunbeam.string_conversion;

import java.util.Arrays;

public class StringConversion {
	public static String stringConversion1(String str) {
		//Creating a string array in order to save sliced string 
		String[] strArr = new String[str.length()];
		
		//Splitting string at " "
		strArr = str.split(" ");
		
		String returnStr = "";
		
		for(String ele : strArr) {
			returnStr += ele.charAt(0);
		}
		
		return returnStr;
	}
	
	public static String stringConversion2(String str) {
		String[] strArr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(String ele: strArr) {
			if(ele.length() > 0)
				sb.append(Character.toUpperCase(ele.charAt(0))).append(ele.substring(1)).append(" ");
			else
				sb.append(" ");
		}
		
		return sb.toString();
		
		
		
	}
	
	public static String stringConversion4(String str) {return " ";}
	
	public static String stringConversion3(String input) {
		String result = null;
		char[] charArr = new char[input.length()];
		
		
	}
	
	
}
