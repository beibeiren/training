package com.training.exception;

// 自定义异常类标准写法
public class SomeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 抛出异常以及异常信息
	public SomeException(String message) {
		throw new RuntimeException(message);
	}
}
