package com.palindrome;

public class CheckPalindeome {
	
	public static boolean isPalindrome(String str) {
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		
		
		s1.append(str);
		s2.append(str);
		s2.reverse();
		String str1 = s1.toString();
		String str2 = s2.toString();
		
		
		
		if(str1.equals(str2)) {
			return true;
		}
		else {
			return false;
		}
	}

}
