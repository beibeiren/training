package com.training.memeryManager;

public class TestPassValue {

	public static void main(String[] args) {

		System.out.println("--------before testPassValue() --------");
		// 引用数据类型
		Dog dog = new Dog("little", 1);
		//　基本数据类型
		int i = 10;
		System.out.println("i= " + i);
		System.out.println("age= " + dog.age);
		System.out.println("name= " + dog.name);
		// 基本数据类型按值传递，参数数值不变；引用数据类型按引用传递，参数数值改变
		TestPassValue test = new TestPassValue();
		test.testPassValue(i, dog);
		System.out.println("--------after testPassValue() --------");
		System.out.println("i= " + i); // 参数数值不变
		System.out.println("age= " + dog.age);   // 参数数值改变
		System.out.println("name= " + dog.name); // 参数数值改变
					
	}
	
	public void testPassValue(int i2, Dog dog2) {
		i2 = 20;
		dog2.age = 5;
		dog2.name = "bigger";
	}

}
