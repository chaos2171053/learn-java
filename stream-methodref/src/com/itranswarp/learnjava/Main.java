package com.itranswarp.learnjava;

import java.util.Arrays;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String[] array = new String[] { "apple", "Orange", "banana", "Lemon" };
		// 请使用忽略大小写排序，并改写为方法引用:
		Arrays.sort(array, Main::compare);
		System.out.println(String.join(", ", array));
	}

	static int compare(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
	}
}
