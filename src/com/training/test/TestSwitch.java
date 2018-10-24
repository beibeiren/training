package com.training.test;

public class TestSwitch {

	public static void main(String[] args) {
		int date = 8;
		switch (date) {
		case 1:
			System.out.println("周一");
			break; // 必须，如果不加则继续向下执行直到遇到break跳出判断 
		case 2:
			System.out.println("周二");
			break;
		case 3:
			System.out.println("周三");
			break;
		case 4:
			System.out.println("周四");
			break;
		case 5:
			System.out.println("周五");
			break;
		case 6:
			System.out.println("周六");
			break;	
		case 7:
			System.out.println("周日");
			break;
		default:
			System.out.println("不知道周几"); // 如果没有满足 条件默认输出
			break;
		}
			
	}

}
