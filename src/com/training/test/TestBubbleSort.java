package com.training.test;

public class TestBubbleSort {
	public static void main(String[] args) {
		// 定义需要排序的int型数组
		int[] arr2 = new int[] { 55, 12, 2, 8, 25 };
		
		// 第一层循环：需要length-1循环可以完成排序
		for (int i = 0; i < arr2.length - 1; i++) {
			// 第二层循环：循环比较次数
			for (int j = 0; j < arr2.length - (i + 1); j++) {
				// 元素两两比较，如果当前元素值大于下一个元素的值，则交换两个元素位置
				if (arr2[j] > arr2[j + 1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j + 1];
					arr2[j + 1] = temp;
				}
			}
		}
		
		// 查看排序结果
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}
}
