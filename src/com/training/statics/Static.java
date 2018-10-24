package com.training.statics;

public class Static {
	public String hello = "hello";         // 非静态成员变量
	public static String hello2 = "hello"; // 静态成员变量
	public static String shareWorld = "hello static";  // 静态成员变量 
	
	// 静态代码块
	static {
		 System.out.println("test static");
	}

	public static void sayHello() {
		// 静态方法中不能访问非静态成员变量
		// System.out.println(hello);  // X 
		System.out.println(hello2);    // 〇
		// 静态方法中不能访问非静态成员方法
		// notStaticMethod();  // X
		staticMethod();        // 〇
	}
	
	// 非静态成员方法
	public void notStaticMethod() {
		System.out.println("this isn`t a static method");
	}
	
	// 静态成员方法
	public static void staticMethod() {
		System.out.println("this is a static method");
	}
}
