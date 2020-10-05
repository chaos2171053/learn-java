package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String a = "12";
		String b = "x9";
		try {
			int d = stringToInt(b);
			int c = stringToInt(a);
			System.out.println(c * d);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	static int stringToInt(String s) {
		return Integer.parseInt(s);
	}
}
