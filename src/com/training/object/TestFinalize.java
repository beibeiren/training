package com.training.object;

public class TestFinalize {

	public static void main(String[] args) {
		ObjectClass oc1 = new ObjectClass(1, "Green");
		oc1 = null;
		// 调用系统垃圾回收机制，回收oc1对象，调用finalize（）方法
		System.gc();
	}

}
