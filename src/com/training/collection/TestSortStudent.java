package com.training.collection;

import com.training.entity.Student;

public class TestSortStudent {

	public static void main(String[] args) {
		Student s1 = new Student(1000, "Tom");
		Student s2 = new Student(1001, "Green");
		
		if(s1.compareTo(s2) == 0) {
			System.out.println("s1,s2学生学号相同");
		}else if(s1.compareTo(s2) > 0) {
			System.out.println("s1学生学号大于s2学生学号相同");
		}else if(s1.compareTo(s2) < 0) {
			System.out.println("s1学生学号小于s2学生学号相同");
		}
	}

}
