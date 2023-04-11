package net.kdigital.lambda;

public class LambdaTest {
	public static void main(String[] args) {
//		MyNumber max = new MyNumber() {
//
//			@Override
//			public int getMax(int num1, int num2) {
//				if(num1 > num2) {
//					return num1;
//				}
//				return num2;
//			}
//		};
//		
//		//삼항 연산자
//		MyNumber max2 = (int num1, int num2) -> {
//			(num1 > num2) ? num1 :num2;
//		}
		
		//람다식으로 추상메서드 구현
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(10, 5));
		
	}

}