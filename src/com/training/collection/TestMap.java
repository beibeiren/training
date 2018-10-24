package com.training.collection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		
		// Hashtable 线程安全
		Map<String, String> map = new Hashtable<String, String>();
		// HashMap   线程非安全
		//Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "teacher1");
		map.put("key1", "teacher2"); // key值是无序不重复的，key值相同的时候，后添加的value值会覆盖之前的值
		map.put("key3", "teacher3");
		map.put("key4", "teacher4");
		map.put("key5", "teacher5");
		
		// 获取所有key值的集合
		Set<String> keys = map.keySet();
		// 迭代器循环key值	
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 获取所有value值的集合
		Collection<String> values = map.values();
		// foreach循环value值
		for (Iterator<String> iterator = values.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.println(string);
		}
		
		// 获取所有<key, value>集合
		Set<Entry<String, String>> entries = map.entrySet();
		Iterator<Entry<String, String>> itor = entries.iterator();
		while(itor.hasNext()) {
			Entry<String, String> entry = itor.next();
			System.out.println("[" + entry.getKey() + ":" + entry.getValue() + "]");
		}
		
		String key ="key1";
		String teacher1 = map.get(key);
		System.out.println(teacher1);
	}
}
