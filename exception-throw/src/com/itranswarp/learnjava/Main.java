package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(tax(2000, 0.1));
		System.out.println(tax(-200, 0.1));
		System.out.println(tax(2000, -0.1));
	}

	static double tax(int salary, double rate) {
		double res = 0;
		try {
			res = salary * rate;
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
		return res;
	}
}
