package com.itranswarp.learnjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
//练习
//给定一组连续的整数并打乱顺序，例如：10，11，12，……，20，其中缺失一个数字，试找出缺失的数字：
public class Main {
	public static void main(String[] args) {
		// 构造从start到end的序列：
		final int start = 10;
		final int end = 20;
		List<Integer> list = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			list.add(i);
		}
		// 洗牌算法suffle可以随机交换List中的元素位置:
		Collections.shuffle(list);
		// 随机删除List中的一个元素:
		int removed = list.remove((int) (Math.random() * list.size()));
		int found = findMissingNumber(start, end, list);
		System.out.println(list.toString());
		System.out.println("missing number: " + found);
		System.out.println(removed == found ? "测试成功" : "测试失败");
	}

	/**
	 * TODO: 找出从start到end的缺失的数字并返回
	 */
	static int findMissingNumber(int start, int end, List<Integer> list) {
		for (int i = start; i <= end; i++) {
			if (!list.contains(i)) {
				return i;
			}

		}
		return 0;
	}
}
