package com.itranswarp.learnjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
/*
 * 需求分析： 复制文件到另一个文件 1. 判断是否存在源文件。 2. 无则抛出异常，有则进行复制 3. 读取源文件内容。 4.
 * 新增目标文件，把源文件的内容写入目标文件。
 */
public class CopyFile {

	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.err.println("Usage:\n  java CopyFile.java <source> <target>");
			System.exit(1);
		}
		copy(args[0], args[1]);
	}

	static void copy(String source, String target) throws IOException {
		File file = new File(source);
		if (!file.exists()) {
			throw new FileNotFoundException("file does not exist.");
		}
		try (InputStream input = new FileInputStream(source); OutputStream output = new FileOutputStream(target)) {
			input.transferTo(output);
		}
	}
}
