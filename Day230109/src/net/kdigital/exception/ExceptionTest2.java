package net.kdigital.exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		
		try {
			//예외가 발생할 수 있는 코드 부분
			System.out.println(10 / 0);
		} catch(ArithmeticException e) {
			//try 블록 안에서 예외가 발생했을 때 예외를 처리하는 부분
			System.out.println("0으로 나눌수 없습니다.");
		}
		System.out.println("이후 프로그램 구동중");
	}

}
