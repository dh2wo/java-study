import java.util.Scanner; //ctrl + shift + m

public class ScannerTest2 {
	public static void main(String[] args) {
		//정수 덧셈 계산기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		
		int result = num1 + num2;
		
		System.out.println("덧셈결과: " + result);
	
	}
}
