package com.training.extend;

public class Son extends Father {
	
	public Son() {
		// 放在第一行
		super();
		String test;
	} 
	
	public Son(int age, String name) {
		super(age, name);
	}
	
	public Son(int age, String name, String color) {
		this.age = age;
		this.name = name;
		this.color = color;
	}

	String color;
	
	public void run() {
		System.out.println("son is running");
	}
	
	public void run(String name) {
		System.out.println(name + " is running");
	}
	
	public void eat() {
		System.out.println("son is eating");
	}

	@Override
	public String toString() {
		return "[name = " + this.name + ",age = " + this.age + ",color = " + this.color + "]";
	}
	
}
