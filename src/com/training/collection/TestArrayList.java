package com.training.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		// ArrayList 线程非安全
		// 有序可以重复，可以添加空值
		List<String> list = new ArrayList<String>();
		list.add("I");
		list.add("Love");
		list.add("U");
		list.add("China");
		list.add("China");
		list.add(null);
		System.out.println(list);
		System.out.println("----------------");
		// for循环
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("----------------");
		// 迭代器
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println("----------------");
		// foreach循环
		for(String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		
	}

}
