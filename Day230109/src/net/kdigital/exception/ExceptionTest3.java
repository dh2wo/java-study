package net.kdigital.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest3 {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}finally { //catch 유무에 상관 없이 무조건 마지막에 가는 곳
			if(fis != null) {
				try {
					fis.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행 됩니다.");
		}
		System.out.println("여기도 수행합니다.");
	}
}
