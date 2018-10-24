package com.training.statics;

public class TestStatic {
	public static void main(String[] args) {
		// 通过类名.属性名调用静态成员变量
		System.out.println(Static.hello2);
		// 通过类名.方法名调用静态成员方法
		Static.staticMethod();
		
		// 静态变量被所有的对象所共享,在内存中只有一个副本
		Static st1 = new Static();
		Static st2 = new Static();
		System.out.println(Static.shareWorld);
		System.out.println(st1.shareWorld);
		System.out.println(st2.shareWorld);
		System.out.println("-----------------");
		Static.shareWorld = "test static";
		System.out.println(Static.shareWorld);
		System.out.println(st1.shareWorld);
		System.out.println(st2.shareWorld);
	}
}
