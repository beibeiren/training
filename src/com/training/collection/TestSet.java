package com.training.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		// set集合无序不重复
		Set<String> set = new HashSet<String>();
		set.add("item1");
		set.add("item1"); // 只添加一个item1
		set.add("item1");
		set.add("item3");
		set.add("item4");
		set.add("item5");
		set.add(null);   // 可以添加空值
		System.out.println(set);
		
		// 迭代器
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
