package com.training.collection;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		// LinkedList的内部实现是链表，适合于需要频发进行插入和删除操作
		LinkedList<String> linkedlist = new LinkedList<String>();

		/* add String Element */
		linkedlist.add("Item1");
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");

		/* Display LinkedList Content */
		System.out.println("Linked List Content: " + linkedlist);

		/* Add First and Last Element */
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("LinkedList Content after addition: " + linkedlist);

		/* This is how to get and set Values */
		String firstvar = linkedlist.get(0);
		System.out.println("First element: " + firstvar);
		linkedlist.set(0, "Changed first item");
		Object firstvar2 = linkedlist.get(0);
		System.out.println("First element after update by set method: " + firstvar2);

		/* Remove first and last element */
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("LinkedList after deletion of first and last element: " + linkedlist);

		/* Add to a Position and remove from a position */
		linkedlist.add(0, "Newly added item");
		linkedlist.remove(2);
		System.out.println("Final Content: " + linkedlist);

	}

}
