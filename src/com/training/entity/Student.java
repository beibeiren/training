package com.training.entity;

public class Student implements Comparable<Student> {

	public Integer stuNum;
	public String name;
	
	
	public Student(Integer stuNum, String name) {
		super();
		this.stuNum = stuNum;
		this.name = name;
	}


	// 按学生学号排序
	@Override
	public int compareTo(Student o) {
		// 大于传入学生学号
		if(this.stuNum > o.stuNum) {
			return 1;
		}
		// 小于传入学生学号
		if(this.stuNum < o.stuNum) {
			return -1;
		}
		
		//this.name.compareTo(o.name);
		// 等于学生学号
		return 0;
	}

}
