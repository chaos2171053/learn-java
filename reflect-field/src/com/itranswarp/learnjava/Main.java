package com.itranswarp.learnjava;

import java.lang.reflect.Field;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();

		Class<? extends Person> c = p.getClass();
		try {
			Field nameField = c.getDeclaredField("name");// get name filed
			nameField.setAccessible(true);
			try {
				nameField.set(p, "Xiao Ming === ");
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		try {
			Field ageField = c.getDeclaredField("age");// get age filed
			ageField.setAccessible(true);
			try {
				ageField.set(p, 26);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
