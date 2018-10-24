package com.training.exception;

public class TestException {

	public static void main(String[] args) {
		TestException test = new TestException();
		try {
			test.testException();
		} catch (Exception e) {
			System.out.println("03.捕获异常，并处理异常打印异常信息");
			System.out.println("04.异常信息：" + e.getMessage());
			e.printStackTrace();
		}
	}

	public void testException() throws Exception {
		try {
			mockSomeException();
		} catch (Exception e) {
			System.out.println("02.捕获异常，并抛出异常");
			// 控制台输出异常信息 
			e.printStackTrace();
			throw e;
		}
	}

	public void mockSomeException() throws Exception {
		// 模拟方法抛出异常，异常信息：some thing is wrong
		throw new SomeException("01.some thing is wrong");
	}
}
