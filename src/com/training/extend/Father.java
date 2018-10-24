package com.training.extend;

public class Father implements Cloneable {
	int age;
	String name;

	public Father() {

	}

	public Father(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public void run() {
		System.out.println("father is running...");
	}

}
