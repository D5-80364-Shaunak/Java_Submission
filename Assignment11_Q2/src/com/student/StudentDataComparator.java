package com.student;

import java.util.Comparator;

public class StudentDataComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		int diff = - s1.getCity().compareTo(s2.getCity());
		if(diff == 0)
			diff = -s1.getMarks().compareTo(s2.getMarks());
			if(diff == 0)
				diff = s1.getName().compareTo(s2.getName());
		
		return diff;
	}
	
}
