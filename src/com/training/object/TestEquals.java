package com.training.object;

public class TestEquals {

	public static void main(String[] args) {
		ObjectClass oc1 = new ObjectClass(1, "Green");
		ObjectClass oc2 = new ObjectClass(2, "Green");
		System.out.println(oc1.name.equals(oc2.name));
		// name相同被视为同一个人
		System.out.println(oc1.equals(oc2));
	}

}
