package com.training.object;

public class ObjectClass implements Cloneable {
	
	public int id;
	public String name;

	// 无参构造函数
	public ObjectClass() {
	}
	
	// 有参构造函数
	public ObjectClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	// 重写父类Object的toString()方法
	@Override
	public String toString() {
		return "[id = " + this.id + ",name = " + this.name + "]";
	}

	// 重写父类Object的clone()方法
	@Override
	public Object clone() {
		ObjectClass clone = new ObjectClass();
		try {
			clone =  (ObjectClass) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	// 重写父类Object的finalize()方法
	@Override
	public void finalize() throws Throwable {
		System.out.println("对象回收完毕");
	}

	// 重写父类Object的equals()方法
	@Override
	public boolean equals(Object obj) {
		if (obj == null || this.name == null) {
			return false;
		}
		ObjectClass o = (ObjectClass) obj;
		if (this.name.equals(o.name)) {
			return true;
		}
		return false;
	}
	
}
