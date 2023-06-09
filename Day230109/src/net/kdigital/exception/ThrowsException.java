package net.kdigital.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.text", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			System.out.println("예외 처리");
		}
	}
}
