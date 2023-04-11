import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2;
		String oper;

		System.out.print("연산자(+,-,*,/) : ");
		oper = sc.next();
		//제어(if, switch) - 걸리면 종료
		//	if(!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("-")) {
		//		System.out.println("연산자를 잘못입력하였습니다");
		//		return;
		//	}
		switch(oper) {
		case "+": 
		case "-": 
		case "*": 
		case "/": 
			break;
		default:
			System.out.println("연산자를 잘못입력하였습니다");
			return;
		}

		System.out.print("첫번쨰 정수 : ");
		num1 = sc.nextInt();
		System.out.print("두번쨰 정수 : ");
		num2 = sc.nextInt();

		switch(oper) {
		case "+":
			System.out.println("덧셈 결과 : " + plus(num1, num2));
			break;
		case "-":
			System.out.println("뺄셈 결과 : " + (num1 - num2));
			break;
		case "*":
			System.out.println("곱셈 결과 : " + (num1 * num2));
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			System.out.println("나눗셈 결과 : " + ((double)num1 / num2));
			break;
		}
	}
	public static int plus(int n1, int n2) {
		return n1 + n2;
	}
}
