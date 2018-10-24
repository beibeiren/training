package com.training.extend;

public class TestExtend extends Object{

	public static void main(String[] args) {
		Father f = new Father(30, "tom");
		System.out.println(f.age);
		System.out.println(f.name);
		Son s = new Son();
		s.name = "json";
		s.age = 5;
		System.out.println(s.age);
		System.out.println(s.name);
		s.run();
		s.run("green");
		// 4. 可以声明父类创建子类
		Father fa = new Son();
		// 4.2 创建什么类型，运行什么类型的方法
		fa.run();
		// 4.3 创建什么类型，就可以强转为该类型
		Son s2 = (Son) fa;
		Son s3 = new Son();
		System.out.println(s3);
		Son s4 = new Son(10, "cat", "red");
		System.out.println(s4);
		s4 = null;
		System.gc();
		System.out.println("-------------------------");
		Father f1 = new Father(30, "tom");
		Father f2 = new Father(42, "tom");
		if(f1.equals(f2)) {
			System.out.println("the same father");
		}else {
			System.out.println("the different father");
		}
		
	}

}
