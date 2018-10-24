package com.training.object;

public class TestToString {

	public static void main(String[] args) {
		ObjectClass o = new ObjectClass(1, "Tom");
		// 默认调用toString（）方法如果没有则调用父类的toString（）方法
		System.out.println(o);
	}

}
