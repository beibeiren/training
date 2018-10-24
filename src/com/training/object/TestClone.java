package com.training.object;

public class TestClone {

	public static void main(String[] args) {
		ObjectClass clone = new ObjectClass(1, "Tom");
		System.out.println("---------------before clone-------------");
		System.out.println("clone.id:" + clone.id);
		System.out.println("clone.name:" + clone.name);
		ObjectClass cloneIt = (ObjectClass) clone.clone();
		System.out.println("---------------after clone-------------");
		System.out.println("cloneIt.id:" + cloneIt.id);
		System.out.println("cloneIt.name:" + cloneIt.name);
		System.out.println("---------------before modify-------------");
		System.out.println(clone.name.equals(cloneIt.name));
		System.out.println(clone.name == cloneIt.name); ; // ��ʒr��
		cloneIt.id = 2;
		cloneIt.name = new String("Tom");
		System.out.println("---------------after modify-------------");
		System.out.println("clone.id:" + clone.id);
		System.out.println("clone.name:" + clone.name);
		System.out.println("cloneIt.id:" + cloneIt.id);
		System.out.println("cloneIt.name:" + cloneIt.name);
		System.out.println("--------------------------");
		System.out.println(clone.name.equals(cloneIt.name));
		System.out.println(clone.name == cloneIt.name); // ��ʒr�a�͓���
		System.out.println("--------------------------");
		cloneIt.name = "Tom";
		System.out.println(clone.name.equals(cloneIt.name));
		System.out.println(clone.name == cloneIt.name); // ��ʒr��
	}

}
