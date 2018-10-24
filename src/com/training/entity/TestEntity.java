package com.training.entity;

import java.util.Date;

public class TestEntity {
	public static void main(String[] args) {
		Teacher teacher = new Teacher(1, "Jeff", "F", new Date(), new Date(), new Date());
		System.out.println(teacher);
	}
}
