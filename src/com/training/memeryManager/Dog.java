package com.training.memeryManager;

public class Dog {

	public Dog() {
		
	}
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String name;
	
	public int age;
	
	public void eat() {
		System.out.println("eating..");
	}
	

	public static void main(String[] args) {
		Dog kala = new Dog("kala", 11);
		
		System.out.println(kala.name);
		kala.name ="cat";
		System.out.println(kala.name);
		
		System.out.println(kala.age);
		kala.eat();
		
		System.out.println("-------------------------------");
		String str1 = "abc";
		// ==
		String new1 = "abc" == str1 ?"ok" : "no";
		System.out.println(new1);
		// equals
		String new2 = "abc".equals(str1) ?"ok" : "no";
		System.out.println(new2); 
		
		// new String
		String str2 = new String("abc");
		String new3 = "abc" == str2 ?"ok" : "no";
		System.out.println(new3);
		
		
		
		

	}

}
