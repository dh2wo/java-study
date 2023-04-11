import java.util.Scanner;

public class FuctionTest {

	public static void main(String[] args) {
		//Day1229 Calculator
		//plus, minus, multiply, divide
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		result = plus(num1, num2);
		System.out.println(result);
		result = minus(num1, num2);
		System.out.println(result);
		result = multiply(num1, num2);
		System.out.println(result);
		result = divide(num1, num2);
		System.out.println(result);
	}
	
	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	public static int divide(int num1, int num2) {
		return num1 / num2;
	}
}
