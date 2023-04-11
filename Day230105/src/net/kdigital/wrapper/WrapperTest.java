package net.kdigital.wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		int num = i.intValue();
		System.out.println(num);
		
		Integer num1 = Integer.valueOf("200"); //문자열로 받아도 정수형으로 처리 가능 valueof
		Integer num2 = Integer.valueOf(200);
		System.out.println(num1);
		System.out.println(num2);
		
		String str = "123";
		int num3 = Integer.parseInt(str); //문자열을 정수로 변환★
		System.out.println(str);
		
		Integer num4 = 100;
		int num5 = 200;
		int sum = num4 +num5; //sum이 int형이라 num4가 int로 변환 (언박싱)
		Integer num6 = num5; //int num5를 Integer로 변환 (오토박싱)
		
		
	}
}
