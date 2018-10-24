package com.training.abstracts;

// 抽象类：abstract关键字修饰的类 
public abstract class AbstractClass {
	
	// 抽象方法：abstract关键字修饰的方法，只有方法声明没有方法体
	public abstract void goHome();

	// 抽象类中可以有非抽象的方法，抽象类中可以没有抽象方法
	public void eatSomething() {
		System.out.println("eat breakfirst");
	}
}
