package com.training.test;

import org.junit.Test;

public class Questions {

	@Test
	public void substring() {
		String str = "abcde";
		String sub = str.substring(1, 3);
		System.out.println(sub);
	}

	@Test
	public void indexof() {
		String str = "abcde";
		String chk1 = "bc";
		if (str.indexOf(chk1) != -1) {
			System.out.println("index=" + str.indexOf(chk1));
			System.out.println(str + "��" + chk1 + "�����݂���");
		} else {
			System.out.println(str + "��" + chk1 + "�����݂��Ȃ�");
		}
		String chk2 = "cc";
		if (str.indexOf(chk2) != -1) {
			System.out.println(str + "��" + chk2 + "�����݂���");
		} else {
			System.out.println("index=" + str.indexOf(chk2));
			System.out.println(str + "��" + chk2 + "�����݂��Ȃ�");
		}

	}

	@Test
	public void calc() {
		int n1 = 127, n2 = 125;
		int sum = n1 + n2;
		System.out.println("n1 + n2 =" + sum);
		int minus = n2 - n1;
		System.out.println("n2 - n1 =" + minus);
		int multiply = n1 * n2;
		System.out.println("n1 * n2 =" + multiply);
		int divide = n1 / n2;
		System.out.println("n1 / n2 =" + divide);

	}

	@Test
	public void sort() {
		int[] arr = new int[] { 2, 4, 8, 1 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - (i+1); j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
//		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	@Test
	public void multiplication() {
		for (int i = 1; i < 10; i++) {
		
			String numstr = "";
			for (int j = 1; j <= i; j++) {
				numstr += j + "*" + i + "=" + (j * i) + " ";
			}
			System.out.println(numstr);
		}

	}

}
