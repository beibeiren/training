package com.training.abstracts;

// 继承抽象类就要实现
public class SubAbstract extends AbstractClass {
	
	// 继承抽象类就要实现抽象类中的抽象方法
	// 如果子类是抽象类可以选择实现方法
	// 如果子类不是抽象类必须实现全部抽象方法，否则报编译异常
	@Override
	public void goHome() {
		System.out.println("by bus");
		
	}

}
